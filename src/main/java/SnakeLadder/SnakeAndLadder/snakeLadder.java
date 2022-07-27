package SnakeLadder.SnakeAndLadder;

import java.util.Random;

public class snakeLadder {
	static int total=0;
	static int total1=0;
	static int cal=0;
	static int count=0;
	static int count1=0;

	static void player1() {
		while (total < 100) {

			int check = (int) Math.floor((Math.random() * 10) % 3);
			checkPlayer(check);
		}
	}

	
	static void Roll() {
		int min=1;
		int max=6;
		int Die_num = (int) Math.floor(Math.random()*(max-min)+min);

		System.out.println("Die = "+Die_num);
		System.out.println("Player 1 rolls the die");
		System.out.println("Die = " + Die_num);

		count = count + 1;  // Count how many times the Die was played

		if (total + Die_num <= 100) {
			total = total + Die_num;

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
	}
		static void player2() {
			while (total < 100) {

				int check = (int) Math.floor((Math.random() * 10) % 3);
			
			int minimum = 1;
			int maximum = 6;
			int dieNumber1 = (int) Math.floor(Math.random() * (maximum - minimum) + minimum);

			System.out.println("Die = " + dieNumber1);

			count1 = count1 + 1;

			if (total1 + dieNumber1 <= 100) {
				total1 = total1 + dieNumber1;
				System.out.println("Player2 in the position = " + total1);
				switch (total1) {
					case 10:
						System.out.println("Ladder");
						total1 = total1 + 10;
						System.out.println("After Ladder = " + total1);
						player2();
						break;
					case 20:
						System.out.println("Snake");
						total1 = total1 - 5;
						System.out.println("After Snake = " + total1);
						player1();
						break;
					case 30:
						System.out.println("Ladder");
						total1 = total1 + 10;
						System.out.println("After Ladder = " + total1);
						player2();
						break;
					case 40:
						System.out.println("Snake");
						total1 = total1 - 5;
						System.out.println("After Snake = " + total1);
						player1();
						break;
					case 50:
						System.out.println("Ladder");
						total1 = total1 + 10;
						System.out.println("After Ladder = " + total1);
						player2();
						break;
					case 60:
						System.out.println("Snake");
						total1 = total1 - 5;
						System.out.println("After Snake = " + total1);
						player1();
						break;
					case 70:
						System.out.println("Ladder");
						total1 = total1 + 10;
						System.out.println("After Ladder = " + total1);
						player2();
						break;
					case 80:
						System.out.println("Snake");
						total1 = total1 - 5;
						System.out.println("After Snake = " + total1);
						player1();
						break;
					case 90:
						System.out.println("Ladder");
						total1 = total1 + 10;
						System.out.println("After Ladder = " + total1);
						player2();
						break;
					case 100:
						System.out.println("Player in the position = " + total1);
						System.out.println("Exit");
						System.out.println(count1 + " times the dice was played to win the game");
						break;
					default:
						player2();

				}
			
		}
			else {
				player2();
			}
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

