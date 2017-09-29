import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Random random = new Random();
    Scanner scnr = new Scanner(System.in);

	int myAge = random.nextInt(18)+1;

	System.out.println("Can you guess my age?");
	int userInput = scnr. nextInt();
	if (userInput == myAge){
	    System.out.println("Yeah! You guessed it!");
    }
    else{
	    System.out.println("Nah bruh I'm " + myAge);
    }



    }
}
