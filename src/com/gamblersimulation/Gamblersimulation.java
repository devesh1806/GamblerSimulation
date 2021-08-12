package com.gamblersimulation;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;


public class Gamblersimulation {
	
	public static final int totalstake = 100 ;
	public static final int bet = 1; 
	
	public static void main(String[] args) {
		
		double resignstake = 0.5;
		
		int month = 1 ;
		while ( true ) {
			Integer[] dayarray = eachmonth();
			for (int i = 0 ; i < 30 ; i++) {
				dayarray[i]=dayarray[i]-totalstake;
			}
			int profit = 0;
			for ( int i = 0 ; i < 30 ; i++) {
				profit +=  dayarray[i];
			}
			if ( profit > 0 ) {
				System.out.println("The profit for month " + month + " is " + profit);
			}
			else {
				System.out.println("Stop gambling due to Loss for month " + month + " of " + profit);
				break;
			}
			month++;
		}
		
	}
	
	//method for getting minimum and maximum of month.
	public static void lucky(Integer[] dayarray) {

		int minimum = Collections.min(Arrays.asList(dayarray));
		System.out.print("The Unluckiest day ");
		printlucky(dayarray,minimum);
		int maximum = Collections.max(Arrays.asList(dayarray));
        System.out.print("The Luckiest day ");
		printlucky(dayarray,maximum);
        
	}
	
	//method for printing lucky and unlucky day of month.
	public static void printlucky(Integer[] dayarray, int x) {
		
		for( int i = 0 ; i < 30 ; i++) {
        	if ( x == dayarray[i]) {
        		System.out.print("occured on day " + (i+1) + " that is " + Math.abs(x));
        		System.out.println();
        		break;
        	}
        }
	}
	
	//method for calculating amount loss or won for month.
	public static Integer[] eachmonth() {
		int daycount = 0;
		Integer[] day = new Integer[30];
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
		return day;
	}
	
	//method for generating probability of win or loss in bet.
	public static int winprob(){
        int prob = (int)((Math.random()*10)%2);
        return prob;
    }
}
