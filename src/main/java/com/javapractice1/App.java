package com.javapractice1;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        int a=sc.nextInt();
        System.out.println("Enter number2");
        int b=sc.nextInt();
        
        div2Numbers(a,b);
        
        
    }
    private static void add2Numbers(int a,int b) {
    	long sum=a+b;
    	LOG.info("The sum of numbers "+a+" and "+b+" = "+sum);
    }
	 private static void div2Numbers(int a,int b) {
    	long sub=a/b;
    	LOG.info("The div of numbers "+a+" and "+b+" = "+sub);
    }
	

}
