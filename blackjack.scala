import scala.io.StdIn.{readLine}
object randomcard{
	val r = scala.util.Random
	var card1 = 2 + r.nextInt(13)
	var card2 = 2 + r.nextInt(13)
	var hitcard = 2 + r.nextInt(13)
}
object cardu{
	def sum(){
		var sum = randomcard.card1 + randomcard.card2 + randomcard.hitcard
		println(sum)
	}
	def cardtypes(){
		randomcard.card1 match {
		case 11 =>  randomcard.card1 = 10
		case 12 => randomcard.card1 = 10
		case 13 =>  randomcard.card1 = 10
		case 14 => randomcard.card1 = 11
		case _ =>  
		}
		randomcard.card2 match {
		case 11 => randomcard.card2 = 10
		case 12 => randomcard.card2 = 10
		case 13 => randomcard.card2 = 10
		case 14 => randomcard.card2 = 11
		case _ =>  
		}
		randomcard.hitcard match {
		case 11 =>  randomcard.hitcard = 10
		case 12 =>  randomcard.hitcard = 10
		case 13 => randomcard.hitcard = 10
		case 14 => randomcard.hitcard = 11
		case _ =>  
		}
	}
}
class cards{
	def setup(){
	println("card 1: " + randomcard.card1)
	println("card 2: " + randomcard.card2)
	println(randomcard.card2 + randomcard.card1)
	println("you wish for hit yes or no?")
	var choice = readLine()
	if (choice == "yes"){
		cardu.sum
		this.hit
	}else{
		println("Keep")
	}
}
	def hit(){
    println("new card: " + randomcard.hitcard)
    println("you wish for hit yes or no?")
    var choice = readLine()
    if (choice == "yes"){
		cardu.sum
		randomcard.hitcard = 0
		this.hit
	}else{
		println("Keep")
		cardu.sum
		}
	}

	
}
var g = new cards
g.setup
