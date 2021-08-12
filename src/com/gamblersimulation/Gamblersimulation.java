package com.gamblersimulation;
import java.util.Random;

public class Gamblersimulation {
	
	public static final int totalstake = 100 ;
	public static int[] day = new int[30];
	public static final int bet = 1; 
	
	public static void main(String[] args) {
		
		
		double resignstake = 0.5;
		
		eachmonth();
		
		
		
	}
	
	public static void eachmonth() {
		int daycount = 0;
		
		int everyday = totalstake ;
				
		Random var = new Random();
		while ( daycount < 30 ) {
			
			int daily = var.nextInt(15);
			
			for(int i=0; i< daily ; i++) {
				if ( winprob() == 1 ) //for win
		             everyday += bet ;
		        else                // for loss
		             everyday -= bet ;
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
