import java.sql.{Connection,DriverManager}
class OverWithdraw extends Exception{}

try {
	Class.forName("com.mysql.cj.jdbc.Driver")
	var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
	val statement = connection.createStatement
	menu()

def menu()={
	println("1.Create account")
	println("2.Deposite Money")
	println("3.withdraw")
	
	var choice = 0
	choice = readInt()
	choice match 
	{
		case 1 => createacc()
		case 2 => depositemoney()
		case 3 => withdraw() 
	}
}

def createacc()={
	println("enter name")
	var nameid = readLine()
	println("enter address")
	var address = readLine()
	println("save record y or n")
	var yes_no = readLine()
	if (yes_no == "y"){
		val ts = statement.executeUpdate("INSERT INTO personal VALUES(NULL,'"+nameid+"','"+address+"')")
		println("do you wish to see your account y or n")
		var showaccount = readLine
		if (showaccount == "y"){
			val showacc = statement.executeQuery("SELECT MAX(acno_id) FROM personal")
			while(showacc.next){
			val acc = showacc.getInt("MAX(acno_id)")
			println("this is you account number friend: " + acc)
			}
		}
	}
	else{
		println("account gone")
		}
}
def depositemoney() ={
	println("enter account number")
	var acc_id = readInt()
	val ns = statement.executeQuery("SELECT * FROM personal WHERE acno_id = " +acc_id)
	if (ns.next){
		var foo = ns.getInt(1)
		val name = ns.getString("nameid")
		val address = ns.getString("addressid")
		println(name,address)
		
		println("enter amount")
		var depono = readInt()
		val dp = statement.executeUpdate("INSERT INTO deposite VALUES('"+acc_id+"','"+depono+"', now())")
		println("yay you did it")

		println("show balance")
		var showbalance = readLine
		if (showbalance == "y" ){
			val sb = statement.executeQuery("SELECT SUM(amount) as abc FROM deposite WHERE acno = " +acc_id)
			if(sb.next){
				val showbal = sb.getInt("abc")
				println("this is your balance: "+showbal)
			}
		}
	}else{
			println("no account is found")
		}
}
def withdraw()={
	println("enter account number")
		var accno = readInt()
		val depamo = 0
	println("Enter amount")
		var withno = readInt()
		val depoamount = statement.executeQuery("SELECT SUM(amount) FROM deposite WHERE acno = " + accno)
		if(depoamount.next){
			val depamo = depoamount.getInt("SUM(amount)")
			println("This is your current balance: "+ depamo)
			try {
				if(withno > depamo){
					var nope = new OverWithdraw
					throw nope
				}else{
					var realbala = depamo - withno
					var withdrawsucc = statement.executeUpdate("INSERT INTO withdraw VALUES('"+ accno +"',NULL,'"+ realbala +"',now())")
					println("You have withdraw: " + withno)
					println("This is your current balance: " + realbala)
				}
			}
			catch {
				case a:OverWithdraw =>{
					println("NOPE NOT ALLOWED YOU WILL BE POOR")
				}
			}
		}
	}		
} catch {
	case e:Exception => println(e)
}
//connection.close

