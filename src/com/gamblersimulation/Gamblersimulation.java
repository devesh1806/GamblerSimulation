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
		
		int[] day = new int[20];
		int daycount = 0;
		
		while ( daycount < 20 ) {
			
			int daily = var.nextInt(15);
			
			for(int i=0; i< daily ; i++) {
				if ( winprob() == 1 ) //for win
		             everyday += everygame ;
		        else                // for loss
		             everyday -= everygame;
			}
					day[daycount]=everyday;
			daycount++ ;
		}
		
		for(int i = 0 ; i < day.length ; i++ ) {
			if ( day[i] < totalstake ) System.out.println("The amount lost on day " + (i+1) + " : " + ( totalstake - day[i] ));
			else if ( day[i] > totalstake ) System.out.println("The amount won on day " + (i+1) + " : " + ( day[i] - totalstake ));
			else System.out.println("The amount was not lost or won on day " + (i+1));
		}
	}
	
	public static int winprob(){
        int prob = (int)((Math.random()*10)%2);
        return prob;
    }
}
