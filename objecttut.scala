/*
object Banks{
	var Dollar = readInt
}

class Bank{
	def amount(a:Int)={
		println("Amount: "+ (a * Banks.Dollar))
	}
	def setdollar(x:Int)={
		Banks.Dollar = x
	}
}

var Barclay = new Bank()
var HSBC = new Bank()
HSBC.amount(5)


var countries = List("UK","USA","Canada")
var capitals = countries.map(findcapitals)

def findcapitals(c:String):String ={
	var city = " "

	if (c == "UK"){
		city = "London"
	}

	if (c == "USA"){
		city = "WashingtonDC"
	}

	if (c == "Canada"){
		city = "Ottawa"
	}
	return city
}
println(capitals)
*/
import java.sql.{Connection,DriverManager}
class OverWithdraw extends Exception{}
object Connection{
	Class.forName("com.mysql.cj.jdbc.Driver")
	var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "")
	val statement = connection.createStatement
}
def findSumAmount(acno:Int):Int ={
	var depamo = 0
	var depoamount = Connection.statement.executeQuery("SELECT SUM(amount) FROM withdraw WHERE acno =" + acno)
	if(depoamount.next){	
		depamo = depoamount.getInt("SUM(amount)")
	}
	return depamo
}

var acnum = List(6,15)
var totalam = acnum.map(findSumAmount)
println(totalam)

var boo = List(43,44,56,78,92)
var boo1 = boo.filter(checkNo)
println(boo1)
def checkNo(a:Int):Boolean={
	if (a%2 == 0){
		return true
	}else{
		return false
	}
}

var accon = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17)
var accon1 = accon.filter(checkacc)
println(accon1)
def checkacc(f:Int):Boolean={
	var depamo = 0
	var depoamount = Connection.statement.executeQuery("SELECT SUM(amount) FROM withdraw WHERE acno =" + f)
	if(depoamount.next){
		return true
	}else {
		return false
	}
}

class school extends break{}

trait break{
	this:school =>
	var oop = "TIME FOR BREAK"
}

trait lunch{
	this:school =>
	var fud = "FUD"
}

class things extends school with break with lunch{}
var loop = new things()
println(loop.fud,loop.oop)