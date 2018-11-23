/*
var zola = "doublehola"
println(zola)

var day = readInt()

day match 
{
	case 1 => println("monday")
	case 2 => println("tuesday")
	case 3 => println("wednesday")
	case 4 => println("thursday")
	case 5 => println("friday")
	case 6 => println("saturday")
	case 7 => println("sunday")
	case _ => println("invalid") 
}

def welcome(name:String, age:Int, address:String, mark:Int) = {
	println("Hello " + name + " My Friends")
	println("You are " + age)
	println("And you live at " + address)
	println("You've scored " + mark + "in the paper")
}
welcome(readLine(),readInt(),readLine(),readInt())

import scala.io.StdIn.{readInt}
def tax(money:Int): Int =
{
	var x = 0
	if (money < 1000)
	{
		var x = 0
		println(x)
	}
	else if (money > 1000 && money <= 2000)
	{
		var x= money * 15/100
		println(x)
	}
	else if (money > 2000 && money <= 3000)
	{
		var x=money * 17/100
		println(x)
	}
	else if (money > 3000)
	{
		var x=money * 21/100
		println(x)
	}
	return x
}
tax(readInt)

def add(A:Int, B:Int) : Int = {
	var x = A + B
	return x
}
add(readInt,readInt)

var multi = 1
var num = 1
for (multi <- 1 to 20){
	println("timestable " + multi)
	for (num <- 1 to 10){
		println(multi + " * " + num +" =  " + multi*num)
	}
}
*/

