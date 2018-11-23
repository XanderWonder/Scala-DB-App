/*
var x = Array(2,3)
try {
	var a = 4
	var b = 0
	var c = x(3)/0
	println("resut " + c)
} catch {
	case  a:ArithmeticException=>{
		println("WHAT ARE YOU DOING")
	}
	case b:ArrayIndexOutOfBoundsException => {
		println("WHAT ARE YOU ZOING")
	} 
}
*/
class AbsentiesException extends Exception{}
class MoreException extends Exception{}
class EvenMoreException extends Exception{}

class Accounts{
	var net = 0
	var salary = 0
	println("THIS IS THE ACCOUNT PAGE")
	def salarycalculations(salary:Int,absenties:Int): Float = {
		var net = 0
		if(absenties >= 6 && absenties < 10){
			var x = new AbsentiesException()
			throw x
		}
		else if(absenties > 10 && absenties <= 31){
			var y = new MoreException()
			throw y
		}
		else if(absenties > 32){
			var z = new EvenMoreException()
			throw z
		}
		else {
			net = salary * 15/100
			println("this is your networth " + net)
		}
		return net
	}	
}
var ref = new Accounts()
try {
	ref.salarycalculations(readInt,readInt)
}catch {
	case a:AbsentiesException => {
		println("WHY YOU DO THIS")
		println("this is you networth " + ref.net + " and your salary " + ref.salary)
		}
	case b:MoreException => {
		println("WHY YOU STILL HERE")
		println("this is you networth " + ref.net + " and your salary " + ref.salary)
	}
  	case c:EvenMoreException =>{
  		println("GET OUT")
  		println("this is you networth " + ref.net + " and your salary " + ref.salary)
  	} 
	}
	finally{
		println("CHA CHA")

	}