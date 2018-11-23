/*
class Land(name:String){
	println("THIS ARE ALL THE LANDS")
	var loc = name
	def places() = {
		var loc = new Array[String](5)
		var i = 0
		while (i < loc.length){
			print(name(i) + " is the place you will visit")
			i += 1
		}
	}
}
var ref = new Land(readLine)
ref.places()


class Numbers(Phy:Int,Che:Int) {
	println("These are the marks for the school")
	def hello()={
		println("Physics: " + Phy)
		println("Chemistry: " + Che)
	}
}
var ref = new Numbers(readInt,readInt)
ref.hello

class Boom{
	println("1st constructor")

	def this(a:Int,b:Int)={
		this()
		println("2nd constructor")
	}
	def this(a:Int,b:Int,c:Int)={
		this()
		println("3rd constructor")
	}
}

var x = new Boom(1,2,3)
*/
class Person{
	private var _age = 0
	private var _name = ""

	def age = _age
	def name = _name

	def age_=(value:Int):Unit = 
		_age = value
	def name_=(value:String):Unit = 
		_name = value

}
var ref = new Person
ref.age = 40
ref.name = "MAac"
println(ref.age,ref.name)


