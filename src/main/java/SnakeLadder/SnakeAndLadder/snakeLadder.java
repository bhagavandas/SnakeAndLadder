package SnakeLadder.SnakeAndLadder;

import java.util.Random;

public class snakeLadder {
	public static void main(String[] args) {
		UC1();
		UC2();
		
	}
	public static void UC1() {
		int position =0;
		System.out.println("Player starting Position : " + position);
}
	public static void UC2() {
		Random r = new Random();
		int randomInt = r.nextInt(6) + 1;
		System.out.println("Die Number: " + randomInt);
	}
}