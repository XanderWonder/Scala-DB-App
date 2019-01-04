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
	var enhealth = 0
	//println("Enemy health: "+ health)
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
	//println("\nPlayer health: " + health)
}

trait Berserker{
	var healthmod = 15
	var phydmgmod = 20 
}
trait Magecraft{
	var healthmod = 7
	var mgkdmgmod = 15
}

class battle{
	val r = scala.util.Random
	def action{
		println("Player health: " + player.health + "\nPlayer attacks strength: " + player.attacks + "\nEnemy health: " + enemy.health + "\nEnemy strength: " + enemy.attacks)
		println("\nAction menu\n1. Attack\n2. Defend\n3. Spells \n4.Run away")
		var choice = readInt
		choice match {
			case 1 => this.attack
			case 2 => this.defend
			case 3 => this.spells
			case 4 => println("TACTICAL RETREAT") 
			case _ => this.action   
		}
	}
	def attack{
		println("\nYour initiative " + player.initiative + "\nEnemy initiative " + enemy.initiative)
		if(player.initiative > enemy.initiative){
			println("\nPlayer attacks strength: " + player.attacks + "\nHit ratio: " + player.hit)
			println("\nEnemy attack strength: " + enemy.attacks + "\nHit ratio: " + enemy.hit)
			if(player.hit > enemy.hit){
				println("Player attack lands")
				enemy.enhealth = enemy.health - player.attacks
				enemy.health = enemy.enhealth
				println("Enemy health: " + enemy.enhealth)
					if(enemy.health <= 0 || enemy.enhealth <= 0){
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
	def spells{
		spellwheel
		def spellwheel{
			println("Choose a spell\n1.Fireball\n2.Aqual Slap\n3.Lighting Bolt")
			var choice = readInt
			choice match {
				case 1 => Fireball
				case 2 => AqualSlap
				case 3 => LightingBolt
				case _ => spellwheel
			}
		}
		def Fireball{
			val r = scala.util.Random
			var damage = r.nextInt(20)
			var casttime = r.nextInt(10)
			println("\nYou choose Fireball\nFireball damage: " + damage + "\nFireball cast time: " + casttime)
			if (casttime < 8){
			println("\nSpell is still charging\nMiss Turn\nEnemy attacks " + enemy.attacks)
				player.health = player.health - enemy.attacks
					println("health: " + player.health)
					if(player.health <= 0){
						println("\nYOU LOSE")
					}else{
						Fireball
					}
			}else{
				enemy.enhealth = enemy.health - damage
				enemy.health = enemy.enhealth
				println("Enemy health: " + enemy.enhealth)
					if(enemy.health <= 0 || enemy.enhealth <= 0){
						println("\nYOU WIN")
					}else{
						this.action
					}
			}
		}
		def AqualSlap{
			val r = scala.util.Random
			var damage = r.nextInt(20)
			var casttime = r.nextInt(10)
			println("\nYou choose Aqual Slap\nAqual Slap damage: " + damage + "\nAqual Slap cast time: " + casttime)
			if (casttime < 8){
				println("\nSpell is still charging\nMiss Turn\nEnemy attacks" + enemy.attacks)
				player.health = player.health - enemy.attacks				
					println("health: " + player.health)
					if(player.health <= 0){
						println("\nYOU LOSE")
					}else{
						AqualSlap	
					}				
			}else{
				enemy.enhealth = enemy.health - damage
				enemy.health = enemy.enhealth
				println("Enemy health: " + enemy.enhealth)
					if(enemy.health <= 0 || enemy.enhealth <= 0){
						println("\nYOU WIN")
					}else{
						this.action
					}
			}
		}
		def LightingBolt{
			val r = scala.util.Random
			var damage = r.nextInt(20)
			var casttime = r.nextInt(10)
			println("\nYou choose Lighting Bolt\nLighting Bolt damage: " + damage + "\nLighting Bolt cast time: " + casttime)
			if (casttime < 8){
			println("\nSpell is still charging\nMiss Turn\nEnemy attacks" + enemy.attacks)
				player.health = player.health - enemy.attacks
					println("health: " + player.health)
					if(player.health <= 0){
						println("\nYOU LOSE")
					}else{
						LightingBolt
					}
			}else{
				enemy.enhealth = enemy.health - damage
				enemy.health = enemy.enhealth
				println("Enemy health: " + enemy.enhealth)
					if(enemy.health <= 0 || enemy.enhealth <= 0){
						println("\nYOU WIN")
					}else{
						this.action
					}
			}
		}
	}
}
class story extends battle{
	def start{
	println("You wake up in a lush forest, as you look around you see three paths which leads to new places but you have no idea where these paths will lead you")
	println("which path do you choose?\n1.The grass path\n2.The dirt path\n3.The stone path")
		var choose = readInt
		choose match {
			case 1 => cave 
			case 2 => forest
			case 3 => ruins
			case _ => println("INVALID") 
		}		
	}
	def cave{
		println("As you follow the grass path you see near the clearing is a cave\nDo you wish to enter the cave?")
		var choice = readLine
			if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
				println("\nAs you enter the cave you felt a chill down you spine \nYou have been spotted by an enemy\nDo you wish to fight?")
				var choice = readLine
				if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
				println("You decided to fight")
				action
				}else{
					println("As you perform the solid snake and went further into the cave, you find some treasure chest\nDo you wish to open it?")
					choice = readLine
					if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
						println("IT WAS ACCTUALLY A MIMIC")
						action
					}
				}
			}else{
				println("You return to the starting point")
				this.start
			}
	}
	def forest{
		println("You choose to follow the dirt path which takes you further into the forest\nAs you walk you feel that someone is watching you")
		println("As the dread ")
		var choice = readLine
			if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
				println("\nAs you enter the cave you felt a chill down you spine \nYou have been spotted by an enemy\nDo you wish to fight?")
				var choice = readLine
				if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
				println("You decided to fight")
				action
				}else{
					
				}
			}else{
				println("You return to the starting point")
				this.start
			}
	}
	def ruins{
		println("As you follow the grass path you see near the clearing is a cave\nDo you wish to enter the cave?")
		var choice = readLine
			if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
				println("\nAs you enter the cave you felt a chill down you spine \nYou have been spotted by an enemy\nDo you wish to fight?")
				var choice = readLine
				if(choice == "y"|| choice == "Y" || choice == "yes" || choice == "Yes" || choice == "YES"){
				println("You decided to fight")
				action
				}else{
					
				}
			}else{
				println("You return to the starting point")
				this.start
			}
	}
}
var sess = new story
sess.start
