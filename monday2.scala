/*
var numbers = Array(-12300,-20,-70,-80,-100,-9174,-4,-76,-89,-60)
var i = 0
var x = numbers(1)
var z = 0
while (i < numbers.length){
	z = numbers(i)	
	if (x < z){
		z = numbers(i)
	}
	i += 1
}		
println(z)

var numbers = Array(1,4,51,7,8,89)
var i = 0
var x = numbers(0)
var z = numbers(0)
while( i < numbers.length){ 
	if (numbers(i) > x){
		z = x
		x = numbers(i)
	}
	else if (x == z){
		z = numbers(i)
	}
	else if (numbers(i) > z){
		z = numbers(i)
	}
	i += 1
}
println(x,z)
*/
var regno = new Array[Int](5)
var name = new Array[String](5)
var marks = new Array[Int](5)
var i = 0

try {
while (i < regno.length)
{
	regno(i) = readInt
	name(i) = readLine
	marks(i) = readInt
	println(regno(i), name(i), marks(i))
	i += 1
}
} catch {
	case a:NumberFormatException =>{
		println("You've entered the wrong details")
	regno(i) = readInt
	name(i) = readLine
	marks(i) = readInt
	i += 1
	}
}
	var a = 0
	var highest = marks(0)
	var index = 0
while (a < marks.length)
{
	if(marks(a) > highest)
	{
		highest=marks(a)
		index = a
	}
	a += 1

}	
println("Name of the max marks man: " + name(index) + " " + marks(index))

