import scala.io.StdIn.{readLine,readInt}
object enemy{
	val r = scala.util.Random
	var health =  r.nextInt(20)
	var attacks =  r.nextInt(20)
	var hit = r.nextInt(10)
	var initiative =  r.nextInt(20)
	def reroll{
		initiative =  r.nextInt(20)
		attacks =  r.nextInt(20)
		hit = r.nextInt(10)
	}
	println("Enemy health: "+ health)
}
object player{
	val r = scala.util.Random
	var health = r.nextInt(20) + 1
	var armour = r.nextInt(5)
	var initiative =  r.nextInt(20)
	var attacks =  r.nextInt(20)
	var hit = r.nextInt(10)
	var bonusarmour = 0
	def reroll{
		initiative =  r.nextInt(20)
		attacks =  r.nextInt(20)
		hit = r.nextInt(10)
		bonusarmour = r.nextInt(5) 
	}
	println("\nPlayer health: " + health)
}
class battle{
	val r = scala.util.Random
	def action{
		println("Action menu\n1. Attack\n2. Defend\n3. Run away")
		var choice = readInt
		choice match {
			case 1 => this.attack
			case 2 => this.defend
			case 3 => println("TACTICAL RETREAT")
			case _ => println("INVALID")    
		}
	}
	def attack{
		println("\nYour initiative " + player.initiative + "\nEnemy initiative " + enemy.initiative)
		if(player.initiative > enemy.initiative){
			println("\nPlayer attacks strength " + player.attacks + "\nHit ratio " + player.hit)
			if(player.hit > enemy.hit){
				println("Player attack lands")
				var enhealth = enemy.health - player.attacks
				enemy.health = enhealth
				println("Enemy health: " + enhealth)
					if(enemy.health <= 0 || enhealth <= 0){
						println("\nYOU WIN")
					}
			}else{
				println("attack misses")
			}
		}else{
			println("\nEnemy attacks strength " + enemy.attacks + "\nHit ratio " + enemy.hit)
			if(enemy.hit > player.hit){
				println("Enemy lands hit")
				var dmg = player.armour + player.bonusarmour - enemy.attacks
				if(dmg > 0){
					println(s"You took $dmg damage ")
					player.health - dmg
				}else{
					println("You took no damage")
				}
				println("health: " + player.health)
					if(player.health <= 0){
						println("\nYOU LOSE")
					}
				}else{
					println("Enemy misses")
				}
			}
		if(player.health <= 0){
			println("DEAD")
		}else{
			println("\nContinue fighting (yes or no)")
			var choice = readLine
			if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
				player.reroll
				enemy.reroll
				this.action
			}else{
				println("\nYOU RUN AWAY")
				}
			}
		}
	def defend{
		player.bonusarmour = r.nextInt(5)
		println("You gained bonus armour: " + player.bonusarmour) 
		this.action
	}
}
var sess = new battle
sess.attack
