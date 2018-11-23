import java.sql.{Connection,DriverManager}
class OverWithdraw extends Exception{}
object Connection{
	Class.forName("com.mysql.cj.jdbc.Driver")
	var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
	val statement = connection.createStatement
}
object Accountno{ var accno = readInt }

var jae = new bankaccount()
jae.menu()
class bankaccount{
	def menu(){
		println("Main Menu of The Bank of MAC")
		println("1.Create account")
		println("2.Deposite Money")
		println("3.Withdraw")
		println("4.QUIT")
		var choice = readInt
		choice match {
			case 1 => createacc()
			case 2 => deposit()
			case 3 => withdraw()
			case 4 => println("BYE BYE")
			case _ => println("BYE BYE") 
}
	}
	def createacc(){
		try {
			println("CREATE ACCOUNT")
			println("enter name")
			var name = readLine()
			println("enter address")
			var address = readLine()
			println("save record y or n")
			var yes_no = readLine()
		if (yes_no == "y"){
			val ts = Connection.statement.executeUpdate("INSERT INTO personal VALUES(NULL,'"+name+"','"+address+"')")
			println("do you wish to see your account y or n")
			var showaccount = readLine
		if (showaccount == "y"){
			val showacc = Connection.statement.executeQuery("SELECT MAX(acno_id) FROM personal")
			while(showacc.next){
			val acc = showacc.getInt("MAX(acno_id)")
			println("this is you account number friend: " + acc)
			}
			println("go back to the main menu y or n")
			yes_no = readLine
		if(yes_no == "y"){
			this.menu
			}
		} 
	}else{ println("account gone") }
		} catch {
			case e:Exception => println("Something went wrong")
		}
	}
	def deposit(){
		try {
			println("DEPOSITE MONEY")
			println("enter account number")
			Accountno
			val ns = Connection.statement.executeQuery("SELECT * FROM personal WHERE acno_id = " +Accountno.accno)
		if (ns.next){
			var foo = ns.getInt(1)
			val name = ns.getString("nameid")
			val address = ns.getString("addressid")
			println(name,address)		
			println("enter amount")
			var depono = readInt()
			println("save trancasion record y or n")
			var ye_na = readLine
			if (ye_na == "y"){
			val dp = Connection.statement.executeUpdate("INSERT INTO deposite VALUES('"+Accountno.accno+"',NULL,'"+depono+"', now())")
			println("You have deposited: " + depono)
			val depoamount = Connection.statement.executeQuery("SELECT SUM(amount) FROM deposite WHERE acno = " + Accountno.accno)
		if(depoamount.next){
			val depamo = depoamount.getInt("SUM(amount)")
			println("This is your current balance: "+ depamo)
			}		
			else{
				println("record deleted")
			}
			println("go back to the main menu y or no")
			var yes_no = readLine
		if(yes_no == "y"){
			this.menu
			}
		}
		else{ println("no account is found") }	
		}
	}catch {
			case e:Exception => println("Something went wrong")
		}
	}
	def withdraw(){
		try {
			println("WITHDRAW MONEY")
			println("enter account number")
			Accountno
			val depamo = 0
			println("Enter amount you want to withdraw")
			var withno = readInt()
			val depoamount = Connection.statement.executeQuery("SELECT SUM(amount) FROM deposite WHERE acno = " + Accountno.accno)
		if(depoamount.next){
			val depamo = depoamount.getInt("SUM(amount)")
			println("This is your current balance: "+ depamo)
			println("Do you wish to continue with the withdraw y or n")
			var continue = readLine
			if (continue == "y"){
				try {
				if(withno > depamo){
					var nope = new OverWithdraw
					throw nope
				}else{
					var realbala = depamo - withno
					var withdrawsucc = Connection.statement.executeUpdate("INSERT INTO withdraw VALUES('"+ 	Accountno.accno +"',NULL,'"+ realbala +"',now())")
					println("You have withdraw: " + withno)
					println("This is your current balance: " + realbala)
					//val dp = Connection.statement.executeUpdate("UPDATE deposite SET amount = '"+ realbala +"'WHERE acno =" + Accountno.accno)
					println("go back to the main menu y or n")
					var yes_no = readLine
				if(yes_no == "y"){
					this.menu
					}
				}
			}catch {
				case a:OverWithdraw =>{
					println("NOPE NOT ALLOWED YOU WILL BE POOR")
						}
					}	
				}
			}
		} catch {
			case e:Exception => println("Something went wrong")
		}
	}
}