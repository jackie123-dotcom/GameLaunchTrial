package ineuron.com;

import java.util.*;

public class LinearSearch2 {

	public static void main(String[] args) {
		
		Combo co = new Combo();
		co.collectNumFromGuesser();
		co.collectNumFromPlayers();
		co.compare();
	}
}
class Guesser  {
	
int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}

class Player {
	
		int guessNum;
		
		int guessNum()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Player kindly guess the number");
			guessNum=scan.nextInt();
			return guessNum;
		}
	
}

class Combo {
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
    
    public void compare() {
    	
    	if(numFromGuesser == numFromPlayer1) {
    		
    		if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
    			System.out.println("They all won the game, congratulations to you the participants");
    		}
    		else if(numFromGuesser == numFromPlayer2) {
    			System.out.println("Player 1 and Player 2 won the game, yay!!");
    		}
    		else if(numFromGuesser == numFromPlayer3) {
    			System.out.println("Player 1 and Player 3 won the game, awesome!");
    		}
    		
    		else {
        		System.out.println("Player 1 won the game, wow!!");
        	}
    	}
    	
    	else if(numFromGuesser == numFromPlayer2) {
    		
    		if(numFromGuesser == numFromPlayer3) {
    			System.out.println("Play 2 and player 3 won the game");
    		}
    		else
    			System.out.println("Player 2 won the game");
    		
    	}
    	else if(numFromGuesser == numFromPlayer3) {
    		System.out.println("Player 3 won the game!!!!");
    	}
    	
    	else {
    		System.out.println("Game lost y'all, please try again");
    	}
    		
    }
		
}
