//Spells
class Spells{
	var spellList:List[String] = List("Fireball","Water Bolt","Earth Slap","Wind Slice")
	var spellSlotList:List[Int] = List(3,3,3,3)
	var randInt = scala.util.Random
	def cast(spell:String){
		for (k <- 0 to this.spellList.length-1){
			if (spell == spellList(k)){//So spell exists
				spell match{
					case "Fireball" => this.Fireball()
					case "Water Bolt" => this.WaterBolt()
					//case "Earth Slap" => this.EarthSlap()
					//case "Wind Slice" => this.WindSlice()
					case _ => print("What)")
				}
			}
		}
	}

	def rollDice(numberOf:Int,size:Int):Int={
		var roll = randInt.nextInt(size*numberOf)+(numberOf)
		println(s"You rolled a $roll")
		return (roll)
	}
	def Fireball():Int={
		var damage = rollDice(2,6)
		var hit = rollDice(1,20)
		if (hit > 10){
			println(s"You did $damage damage")
			return (damage)
		}
		return (0)
	}

	def WaterBolt():Int={
		var damage = rollDice(1,8)
		var hit = rollDice(1,20)
		if (hit > 7){
			println(s"You did $damage damage")
			return(damage)
		}
		return(0)
	}
}

var caster = new Spells
caster.cast("FireBall")
caster.cast("Water Bolt")