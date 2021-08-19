package com.gamblersimulation;
import java.util.Random;
//import java.util.Collections;
import java.util.Arrays;


public class Gamblersimulation {
	
	public static final int totalstake = 100 ;
	public static final int bet = 1; 
	
	public static void main(String[] args) {
		
		
		double resignstake = 0.5;
		Integer[] dayarray = eachmonth();
		
		lucky(dayarray);
		
		
	}
	
	
	public static void lucky(Integer[] dayarray) {

		for (int i=0; i<30;i++) {
			dayarray[i]=dayarray[i]-totalstake;
		}
		Integer minimum = 100000000;
		for(int i=0;i<dayarray.length;i++) {
			if (minimum>dayarray[i]) minimum = dayarray[i];
		}
		System.out.print("The Unluckiest day ");
		printlucky(dayarray,minimum);
		
        Integer maximum = -100000;
        for(int i=0;i<dayarray.length;i++) {
			if (maximum<dayarray[i]) maximum = dayarray[i];
		}
        System.out.print("The Luckiest day ");
		printlucky(dayarray,maximum);
        
	}
	
	public static void printlucky(Integer[] dayarray, Integer x) {
		
		for( int i = 0 ; i < 30 ; i++) {
        	if ( x == dayarray[i]) {
        		System.out.print("occured on day " + (i+1) + " that is " + Math.abs(x));
        		System.out.println();
        		break;
        	}
        }
	}
	
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
	
	public static int winprob(){
        int prob = (int)((Math.random()*10)%2);
        return prob;
    }
}
