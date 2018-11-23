class One{
	def message = {
		println("Hola")
	}
}
class Two extends One{ 

	def msg = {
		message
		println("HOLA AMIGO")
		def Addition(A:Int,B:Int)={
			var result = A + B
			println("result is: " + result)
		}
		def Subtraction(A:Int,B:Int)={
			println(A-B)
		}
		def Multiplication(A:Int,B:Int)={
			println(A*B)
		}
	}
}
class Three extends Two {
	message
		def Subtraction(A:Int,B:Int)={
		var result = A - B
		println("result is: " + result)	
	}
	def Multiplication(A:Int,B:Int)={
		var result = A * B
		println("result is: " + result)
	}
}
var kid = new Three()
kid.Subtraction(5,2)
kid.Multiplication(5,2)
