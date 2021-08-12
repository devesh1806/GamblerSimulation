package com.gamblersimulation;
import java.util.Random;

public class Gamblersimulation {
	public static final int totalstake = 100 ;
	public static void main(String[] args) {
		
		//Start with 100 every day and for every game 1 condition initialised.
		int everyday = totalstake ;
		int everygame = 1 ;
		
		double resignstake = 0.5;
		
		Random var = new Random();
		
		int day = 0;
		while ( day<20 ) {
			int daily = var.nextInt(15); 
			for(int i=0; i< daily ; i++) {
				if ( winprob() == 1 ) //for win
		             everyday += everygame ;
		        else                // for loss
		             everyday -= everygame;
			}
			day++ ;
		}
		
		if ( everyday < totalstake ) System.out.println("The amount lost after playing 20 days is " + (totalstake-everyday));
		else if ( everyday > totalstake ) System.out.println("The amount won after playing 20 days is " + (everyday-totalstake));
		else System.out.println("You have exact amount as before " + totalstake);
	}
	
	public static int winprob(){
        int prob = (int)((Math.random()*10)%2);
        return prob;
    }
}
