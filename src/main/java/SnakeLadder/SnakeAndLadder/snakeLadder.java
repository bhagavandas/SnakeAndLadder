package SnakeLadder.SnakeAndLadder;

import java.util.Random;

public class snakeLadder {

	static int position=0;
	static int Die_Num;
	static int check;
	static int position1;
	
	public static void main(String[] args) {
		
		System.out.println("Position : " + position);
		Roll();
		checkPlayer(check);
		
	}
	
		public static void Roll() {
		Random r = new Random();
		Die_Num = r.nextInt(6) + 1; // rolling a die, getting the number randomly
		System.out.println("DieNumber: " + Die_Num);
		checkPlayer(check);

	}
		
				static void checkPlayer(int check) {
					int position1;
					String[] options = { "NoPlay", "Ladder", "Snake" };
					Random r = new Random();
					int random_option = r.nextInt(options.length);
					System.out.println("check option : " + options[random_option]);
			
			
			while(position==100){
				position++;	
			
			switch (position) {
			
				case 0:
					position=Die_Num+0;
				System.out.println("Incase of No play, Position is at same stage : "+ position);
					break;
				case 1:
					position=position+Die_Num;
					System.out.println("Incase of Ladder, Position is : "+ position);
					break;
				case 2:
					position=position-Die_Num;
					System.out.println("Incase of Snake, Position is : "+ position);
	
			}
			}
		}
		}
		
		



