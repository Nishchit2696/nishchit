package guess;
import java.util.Scanner;
public class guess {
	public static void main(String[] args) {
		System.out.println("Think of a whole number betwen 1 and 20000. I'll guess what it is!");
		System.out.println("When you're ready, press enter.");
		Scanner scanner = new Scanner(System.in);
		//ignore the yes
		scanner.nextLine();
		
		int min = 1;
		int max = 20000;
		
		int guesses = 0;
		boolean done = false;
		while(!done){
			
			int guess = min + (int)(Math.random() * (max - min + 1));
			guesses++;
			
			System.out.println("My guess is: " + guess);
			System.out.println("Please type yes if I got it right. Please type h if your number is greater l if your number is lower");
			System.out.println("Then press enter.");
			
			String answer = scanner.nextLine();
						
			if(answer.equals("l")){
				max = guess - 1;
			}
			else if(answer.equals("h")){
				min = guess + 1;
			}
			else{
				System.out.println("Hooray!");
				System.out.println("Thanks for playing!");	
				done = true;
			}
		}
		scanner.close();
	}

}
