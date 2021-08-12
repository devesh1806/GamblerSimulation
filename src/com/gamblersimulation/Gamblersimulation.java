package com.gamblersimulation;

public class Gamblersimulation {
public static void main(String[] args) {
		
		//Start with 100 every day and for every game 1 condition initialised.
		int everyday = 100 ;
		int everygame = 1 ;
		
		int totalstake = everyday;
		double resignstake = 0.5;
		
		while ( everyday > (int)(totalstake*resignstake) && everyday <= (int)(totalstake + (totalstake*resignstake))) {
			
			if ( winprob() == 1 ) //for win
	             everyday += everygame ;
	        else                // for loss
	             everyday -= everygame;
			
		}
		
		if ( everyday == everyday*resignstake ) System.out.println("The Gambler resigned due to losing " + (int)(totalstake*resignstake));
		else System.out.println("The Gambler resigned due to winning " + (int)(totalstake + (totalstake*resignstake)));
	}
	
	public static int winprob(){
        int prob = (int)((Math.random()*10)%2);
        return prob;
    }
}
