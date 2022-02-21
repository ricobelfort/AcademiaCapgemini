package exerciseCap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		List<String> StepsLadder = new ArrayList<>();

		 

		System.out.print("Digite a quantidade de vezes: ");
		int amountStepsLadder = entry.nextInt();

		 

		for (int i = 0; i < amountStepsLadder; i++) {
			StepsLadder.add(" ".repeat(amountStepsLadder - i) + "*".repeat(i + 1));
		}

		 

		for (String StepLadder : StepsLadder ) {
			System.out.println(StepLadder);
		}
		
	}

}