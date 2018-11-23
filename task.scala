def NumbertoBin(i:Int) : String = {
	var number = i
	var word = ""
	while (number >= 1)
	{
	if(number%2 == 1){
		word = "1" + word
	}
	if(number%2 == 0){
		word = "0" + word
	}
	number = number / 2
}
	return word
}

def BinarytoNum(f:String): Int = {
	var decimal = 0
	var multi = 0
	var bin = f.length - 1
	while (bin >= 0){
		if(f.substring(bin,bin+1) == "1"){
			decimal = decimal + ((scala.math.pow(2,multi))* 1).toInt
		}
		else{
			decimal = decimal + ((scala.math.pow(2,multi))* 0).toInt
		}
		multi += 1
		bin -= 1
	}
	return decimal
}
println("The binary of the number is " + NumbertoBin(readInt))
println("The number of the binary is " + BinarytoNum(readLine))
