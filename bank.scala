abstract class bank{
	def deposit(A:Int)
	def withdraw(A:Int)
	def showbalance()
}
class McBank extends bank{
	var deposno = 0
	var widthdrawno = 0
	var currentaccno = 0
	override def deposit(A:Int)={
		deposno = A
		deposno = currentaccno + deposno
		println(deposno + " = deposit")
	}
	override def withdraw(A:Int)={
		widthdrawno = currentaccno - A 
		println(widthdrawno + " = withdraw")
	}
	override def showbalance ={
		var accwithdrawno = widthdrawno
		var accdepositno = deposno
		println(accdepositno + " = money in the account after deposit")
		println(accwithdrawno + " = money in the account after withdraw")
	}
}
var bilal = new McBank()
bilal.deposit(readInt)
bilal.withdraw(readInt)
bilal.showbalance()