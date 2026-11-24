public class Hello{
	private int health;
	private int direction;
		public boolean isAlive(){
			if(this.health <= 0){
				return false;
			}
			else{
				return true;
			}
		}
		public void play(){
			if(isAlive()){
				System.out.println(health);
				System.out.println("Enter the next move");
				switch(direction){
					case 8 : System.out.println("move up");
					break;
					case 6 : System.out.println("move right");
					break;
					case 4 : System.out.println("move left");
					break;
					case 2 : System.out.println("move down");
					break;
					default : System.out.println("You havenot entered anything or wrong input");

				}
			}
			else{
				System.out.println("Dead");
			}
		}
		public void setHealth(int myHealth){
			this.health = myHealth;
		}
		public void setDirection(int myDirection){
			this.direction = myDirection;
		}
}
