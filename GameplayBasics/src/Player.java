import java.util.*;
public class Player {
	private String name;
	private int health;
	private int x;
	private int y;
	private static List<Player> players = new ArrayList<>();
	
	public Player(String name, int health, int x, int y){
		this.name = name;
		this.health = health;
		this.x = x;
		this.y = y;
		players.add(this);
	}
	public String getName(){
		return this.name;
	}
	public int getHealth(){
		return this.health;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void takeDamage(int amount){
		this.health = Math.max(0, health - amount);
	}
	public boolean isAlive(){
		if(this.health > 0){
			return true;
		}
		return false;
	}
	public void moveTo(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}
	public void move(int dx, int dy){
		moveTo(this.x + dx, this.y + dy);
	}

	public void visitCell(Cell cell){
		moveTo(cell.getX(), cell.getY());
		if(cell.getHasEnemy()){
			System.out.println("There's an ennemy!");
		}
	}
	@Override public String toString(){
		return ("Player: " + this.name + " has " + this.health + " health points and is at positions(" + this.x + "," + this.y + ").");
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Player)) return false;
		Player p = (Player) o;
		return this.name.equals(p.name)
				&& this.health == p.health
				&& this.x == p.x
				&& this.y == p.y;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, health, x, y);
	}
	//not needed because we have override toString()
	//public static void playersList(){
		//for( Player p: players){
			//System.out.println(p.toString());
		//}
	//}
	public static void main(String[] args){
		List<Player> enlistedPlayers = new ArrayList<>();
		Player player1 = new Player("Ember", 100, 15, 30);
		Player player2 = new Player("Lantern", 50, 30, 15);
		Player player3 = new Player("Bob",70, 10, 20 );
		enlistedPlayers.add(player1);
		enlistedPlayers.add(player2);
		enlistedPlayers.add(player3);
		for(int i = 0; i <= enlistedPlayers.size(); i++){
			Player p = enlistedPlayers.get(i);
			if(p.getName().equals("Bob")){
				p.takeDamage(70);
			}
			if(p.getHealth() <= 0){
				enlistedPlayers.remove(p);
			}
		}
		for(Player p: enlistedPlayers){
			System.out.println(p);
		}
		//Iterator<Player> it = enlistedPlayers.iterator();
		//while (it.hasNext()) {
			//Player p = it.next();
			//if (p.getName().equals("Bob")) {
				//p.takeDamage(70);
			//}
			//if (p.getHealth() <= 0) {
				//it.remove();
			//}
		//}
		//enlistedPlayers.removeif(p -> p.getHealth() <= 0);
		//Player a = new Player("Ada", 100, 0, 0);
		//Player b = a;
		//Player p = null;
		//Player c = new Player("Ada", 100, 0, 0);
		//System.out.println(a == b);
		//System.out.println(a == c);
		//System.out.println(a.equals(c));
		//System.out.println(player1.toString());
		//System.out.println(player2.toString());
		//System.out.println(player1.getName());
		//System.out.println(player2.getHealth());
		//System.out.println(players);
		//System.out.println(p.getName());
		//player.name = "Ember";
		//player.health = 100;
		//player.x = 15;
		//player.y = 30;
		//System.out.println(player.toString());
	}

}


