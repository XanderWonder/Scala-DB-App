/*
class Asda{
	var productname = readLine
	var quantity = readInt
	var price = readFloat
	var bought = readInt
	def amount = {
		var total = quantity * price
		println("Amount cost of the products")
		println("Total amount cost: " + total)
	}
	def bill = {
		var vat = price * 0.15
		var netprof = vat * 0.25
		println("Bill")
		println("Product name: "+productname)
		println("Quantity: "+quantity)
		println("Price: " + price)
		println("VAT: "+ vat)
		println("NetPorfit: "+ netprof)
	}
	def profit{
		var proprofit = quantity - bought * price
		println("Profit")
		println("Profit for the product " + productname +": "+ proprofit)
	}

}
var store = new Asda()
store.amount
store.bill
store.profit
*/
class Results{
	private var Phy:Int = 0
	private var Che:Int = 0
	private var Bio:Int = 0
	private var Total:Int = 0
	var fail = 0

	private def grades(P:Float):String={
		
		var grade=""
		if(P==150) grade="A+"
		else if(P>120) grade="A"
		else if(P>90) grade="B"
		else if(P>60) grade="C"
		else {
			grade=" fail"
			fail+=1
		}
		return grade
	}
	def Physic(i:Int)={
		if(i>= 0 && i <= 150){
			Phy = i
		}
		else{
			println("WHAT ARE YOU DOING?")
		}
	}
	def Chemistry(i:Int)={
			if(i>= 0 && i <= 150){
			Che = i
		}
		else{
			println("WHAT ARE YOU DOING?")
		}
	}
	def Biology(i:Int)={
		if(i>= 0 && i <= 150){
		Bio = i
		}
		else{
			println("WHAT ARE YOU DOING?")
		}
	}
	private def calculations ={

		
		fail match {
			case 0 =>{
				println( "Percentge for Chemistry:"+grades(Phy))
				println( "Percentge for Bio:"+grades(Che))
				println( "Percentge for Physics:"+grades(Bio))
			}
			case 1 => println("Retake exam")
			case 2 => println("Retake the module")
			case 3 => println("Go Home")  
		}
	}
	def ShowCal={
		calculations
	}
}
var Bilal = new Results()
Bilal.Physic(readInt)
Bilal.Chemistry(readInt)
Bilal.Biology(readInt)
Bilal.ShowCal