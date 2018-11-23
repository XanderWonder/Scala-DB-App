	var answer = " "
	var num = readInt 

	if(num >= 1000){
		answer = SpecUnits(num/1000) + " thousand"
		num = num - (num/1000) * 1000
	}
	if (num>=100){
		answer += SpecUnits(num/100) + " hundred"
		num = num - (num/100) * 100
	}
	if(num >= 20){
		answer += Tenz(num/10*10) + SpecUnits(num%10)
	}
	if(num<=19){
		answer += SpecUnits(num)
	}
	println(answer)

def SpecUnits(Number:Int): String = {
var result = " "
	Number match {
		case 1 => result = " one " 
		case 2=> result = " two "
		case 3=> result = " three "
		case 4=> result = " four "
		case 5=> result = " five "
		case 6=> result = " six "
		case 7=> result = " seven "
		case 8=> result = " eight "
		case 9 =>result = " nine "
		case 10=> result = " ten "
		case 11=> result = " eleven "
		case 12=> result = " twelve "
		case 13 =>result = " thirteen "
		case 14=> result = " fourtheen "
		case 15=> result = " fiftheen "
		case 16=> result = " sixtheeen "
		case 17=> result = " seventheen "
		case 18=>  result = " eightheen "
		case 19=>  result = " ninetheen "

	}
	return result
}
def Tenz(Tenumber:Int): String = {
	var result = " "
	Tenumber match {
		case 20=> result = " twenty "
		case 30=>  result = " thirty "
		case 40=> result = " fourty "
		case 50=>  result = "fifthy "
		case 60=> result = " sixty "
		case 70=> result = " seventy "
		case 80=> result = " eighty "
		case 90=> result = " ninety "  
	}
	return result
}

