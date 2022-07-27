package SnakeLadder.SnakeAndLadder;

import java.util.Random;

public class snakeLadder {
	static int total=0;
	static int cal=0;
	static int count=0;

	//  use function  to roll the die
	static void Roll() {
		int min=1;
		int max=6;
		int Die_num = (int) Math.floor(Math.random()*(max-min)+min);

		System.out.println("Die = "+Die_num);


		if (total <= 100) {

			total=total+Die_num; 
			System.out.println("Player in the position = "+total);
			switch (total) {
				case 10:
					System.out.println("Ladder");
					total=total+10;
					System.out.println("After Ladder = "+total);
					break;
				case 20:
					System.out.println("Snake");
					total=total-5;
					System.out.println("After Snake = "+total);
					break;
				case 30:
					System.out.println("Ladder");
					total=total+10;
					System.out.println("After Ladder = "+total);
					break;
				case 40:
					System.out.println("Snake");
					total=total-5;
					System.out.println("After Snake = "+total);
					break;
				case 50:
					System.out.println("Ladder");
					total=total+10;
					System.out.println("After Ladder = "+total);
					break;
				case 60:
					System.out.println("Snake");
					total=total-5;
					System.out.println("After Snake = "+total);
					break;
				case 70:
					System.out.println("Ladder");
					total=total+10;
					System.out.println("After Ladder = "+total);
					break;
				case 80:
					System.out.println("Snake");
					total=total-5;
					System.out.println("After Snake = "+total);
					break;
				case 90:
					System.out.println("Ladder");
					total=total+10;
					System.out.println("After Ladder = "+total);
					break;
				case 100:
					System.out.println("Won the Game"); 
					break;
			}
		}
		else {
			Roll();
		}
	}

	static void checkPlayer(int check) {

		switch (check) {

			// check not want to play or go to die
			case 0:
				System.out.println("No play");
				break;
			case 1:
				Roll();
				break;
			case 2:
				Roll();
				break;
			
		}
	}


	public static void main(String[] args) {

		int player = 1;
		int position = 0;
		System.out.println("Player in the position = " + position);

		while (total < 100) {  
			int check = (int) Math.floor((Math.random() * 10) % 3);

			checkPlayer(check);
		}
	}
}

