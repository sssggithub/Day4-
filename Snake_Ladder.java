package day4;

public class Snake_Ladder {
	static int player = 0;
public void rolldice() {
	System.out.println("Start The Game");
	int dicecheck = (int) (Math.random() * 6) + 1;
	System.out.println("Trown Dice Number:" + dicecheck);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snake And Ladder Computation Program");
		System.out.println(" Player is at position :" + player);
		Snake_Ladder s=new Snake_Ladder();
		s.rolldice();
	}

}
