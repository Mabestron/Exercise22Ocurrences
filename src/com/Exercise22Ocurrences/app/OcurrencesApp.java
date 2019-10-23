package com.Exercise22Ocurrences.app;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
public class OcurrencesApp 
{

	public static void main(String[] args) 
	{
		//Constant declaration
		final int ELEMENTS=1000;
		
		//Variable declaration
		//Scanner input = new Scanner(System.in);
		Random numbers = new Random(System.nanoTime());
		HashMap <Integer, Integer> miHash =new HashMap<Integer,Integer>();

		int[] miArray = new int [ELEMENTS];
		for (int i=0;i<ELEMENTS;i++)
		{
			miArray[i] =numbers.nextInt(101);
		}
		
		for (int i: miArray)
		{
			System.out.print(" "+i);
		}
		
	}

}
