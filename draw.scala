/*
class One{
	def msg1() ={
		println("haol")
	}
	def msg2() = {
		println("hoals")
	}
}
class Two extends One{
	def boom() ={
		println("HOLASA")
	}
}
var x:One = new Two()
x.msg1
x.msg2
*/
abstract class Draw{
	def drawing()
	final def shape() ={
		println("OH hey it work")
	}
}

class Line extends Draw {
	override def drawing() = {
		println("HELLO")
		println("------------")
	}
}
class Cicle extends Draw{
	override def drawing() = {
		println("I AM THE")
		println("Nope not making a Cicle")
	}
}
class Square extends Cicle{
	override def drawing() = {
		println("SHAFEEQ")
		println(" --------")
		println("| 	 |")
		println( " --------")
	}
}

def letsdodraw(x:Draw){
	x.drawing()
	x.shape()
}

var l = new Line()
letsdodraw(l)
var c = new Cicle()
letsdodraw(c)
var s = new Square()
letsdodraw(s)