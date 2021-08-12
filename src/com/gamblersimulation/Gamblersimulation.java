package com.gamblersimulation;

public class Gamblersimulation {
public static void main(String[] args) {
		
		//Start with 100 every day and for every game 1 condition initialised.
		int everyday = 100 ;
		int everygame = 1 ;
		
		int totalstake = everyday;
		
		if ( winprob() == 1 ) //for win
             everyday += everygame ;
        else                // for loss
             everyday -= everygame;
		
		if (everyday>100) System.out.println("Player won bet");
		else System.out.println("Player lost bet");
	
	}
	
	public static int winprob(){
        int prob = (int)((Math.random()*10)%2);
        return prob;
    }
}
