import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
	System.out.println("Rolling dice...");

	Random rand = new Random();

	int dice1 = rand.nextInt(6) = 1;
	int dice2 = rand.nextInt(6) = 1;

	System.out.println("Die 1: " + dice1);
	System.out.println("Die 2: " + dice2);

	int total = dice1 + dice2;
	System.out.println("Total value: " + total);
    }
}

				   
