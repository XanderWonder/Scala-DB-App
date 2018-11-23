/*
var zola = "doublehola"
println(zola)

var dolla = 12
println(dolla)

if dolla = 13
{
	println("hahaahahaha")
}
else
{
	println("noooooo")
}
*/
/*
//while loops
var a = 1
while(a <=10)
{
	println("hello")
	a = a+1
}

var b = 2
while(b<=10)
{
	print(b)
	if(b%2==0)
	{
		println("even")
	}
	else
	{
		println("odd")
	}
	b=b+1
}

var c = 1
for (c <- 1 until 10)
{
	println ("value of c: " + c)
}

var d = 1
while (d <=20)
{
	if (d != 10){
		println("D")
		if (d < 10){
			println("X")
			if (d %2 == 0){
				println("even")
			}
			else{
				println("odd")
			}
		}
		else{
			println("Y")
		}
	}
	else{
		println("oops")
	}
	d = d+1
}

var e = 1
do{
	println("Value of e " + e)
	e = e+1
}
while (e < 10)

var multi = 1
var num = 1
while (multi <= 20){
	println("timestable of " + multi)
	num = 1
	while (num <= 10){
		println(multi + "x" + num + "=" + multi * num)
		num = num + 1
	}
	multi = multi + 1
}

var number = 1
while (number <= 30){
	if (number%3 == 0){
		var number2 = 1
		while (number2 <= number){
			print(number2)
			number2 = number2 +1
		}
		print("\n")
	}
	else{
		println(number)
	} 
	number = number + 1
}

var g = "hola dolla do la"
println(g.length())
println(g.substring(3,10))

 var msg = "Hello I am Shafeeq THE ........ Shafeeq"
 var count = msg.length() - 1
 while (count > -1){
 	if (msg.substring(count, count + 1) == " "){
 		print("\n")
 		count -= 1
 	}
 	else{
 		print(msg.substring(count, count + 1))
 		count -= 1
 	}
}
var msg = "HOW CAN THIS BE, DEFEATED BEFORE MY RISE"
var word = " "
var i = msg.length() - 1
while(i >= 0){
	if(msg.substring(i,i + 1) == " "){
		println(word)
		word = " "
	}
	else{
		word = msg.substring(i,i + 1) + word
	}
	i = i - 1 
}
println(word)

var msg = "I am, going to am To am going and going"
var i = 0
var word = "going"
var account = 0
while (i <= msg.length() - word.length()){
	if(msg.substring(i,i + word.length()) == word){
	    account +=1	
	}
	i += 1 
}
print(account)
print(" = " + word)

var word = 0
var find = "Shafeeq"
var msg = "Shafeeq is Shafeeq was, Shafeeq will be"
var x = 0
var replace = "Johnnyu"
while(x < msg.length()){
	if(msg.substring(x, x + 1) == find.substring(0, 1)){
		if(msg.substring(x,x+find.length()) == find){
			word += 1
			x = x + find.length() - 1
			if(find.substring(0,1) == 0){
				find = "John"
				print(msg)
			}
		}
	}
	x = x + 1
}
*/

