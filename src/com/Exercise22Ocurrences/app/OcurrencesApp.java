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

		int[] miArray = new int [ELEMENTS];// se crea un arreglo de enteros
		
		
		//se rellena el vector
		for (int i=0;i<ELEMENTS;i++)
		{
			miArray[i] =numbers.nextInt(101);
		}
		
		//se muestra el vector con un for each
		// por cada elemento "i" que se encuentra dentro del arreglo "miArray", se imprime el elemento
		for (int i: miArray)
		{
			System.out.print(" "+i);
		}
		
		//process
		int ocurrences=0;
		for (int element: miArray)
		{
			
			if (miHash.containsKey(element))
			{
				ocurrences=miHash.get(element);
				ocurrences++;
				miHash.put(element, ocurrences);
				
			}
			else 
			{
				miHash.put(element, 1);
			}
			
			//miHash.putIfAbsent(element, 1);  //Alternativo del else
		}
		
	System.out.println(" ");	
	System.out.println(miHash);	
	
	}

}
