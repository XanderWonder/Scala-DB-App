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
		var phytotal = Phy
		var chetotal = Che 
		var biotolat = Bio 
		var fail = 0

		if (phytotal >= 60 && phytotal < 90){
			println("Percentage Physics " + phytotal + " Grade: C")
		}else if (phytotal >= 90 && phytotal < 120){
			println("Percentage Physics " + phytotal + " Grade: B")
		} else if(phytotal >= 120 && phytotal < 150){
			println("Percentage Physics " + phytotal + " Grade: A")
		}else if (phytotal == 150){
			println("Percentage Physics " + phytotal + " Grade: A+")
		}else if(phytotal <= 59){
			println("Failed this module")
			fail += 1
		}

		if (chetotal >= 60 && chetotal < 90){
			println("Percentage Chemistry "+ chetotal + " Grade: C")
		} else if (chetotal >= 90 && chetotal < 120){
			println("Percentage Chemistry "+ chetotal + " Grade: B")
		}else if (chetotal >= 120 && chetotal < 150){
			println("Percentage Chemistry "+ chetotal + " Grade: A")
		}else if (phytotal == 150){
			println("Percentage Chemistry "+ chetotal + " Grade: A+")
		}else if(chetotal <= 59){
			println("Failed this module")
			fail += 1
		}

		if (biotolat >= 60 && biotolat < 90){
			println("Percentage Biology " + biotolat + " Grade: C")
		}else if (biotolat >= 90 && biotolat < 120){
			println("Percentage Biology " + biotolat + " Grade: B")
		}else if (biotolat >=120 && biotolat < 120){
			println("Percentage Biology " + biotolat + " Grade: A")
		}else if(biotolat == 150){
			println("Percentage Biology " + biotolat + " Grade: A+")
		}else if(biotolat <= 59){
			println("Failed this module")
			fail += 1
		}

		fail match {
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