package com.EpamPEP.Task3;

import java.util.*;
public class App
{

	public static void main(String[] args)
	{
         	try
         		{
        	 	int count=0;
        	 	boolean ja=true;
				Scanner sc=new Scanner(System.in);
				System.out.println("Welcome to calculator Application\nSelect operation:\n\t\t1. '+'\n\t\t2. '-'\n\t\t3. '*'\n\t\t4. '/'\n\t\t5. '%'");
				System.out.println("Enter Option 1/2/3/4/5: ");
				int op=sc.nextInt();
				if(op>=1 && op<=5)
				{
				System.out.println("Enter 1st Number");
				int n1=sc.nextInt();
				System.out.println("Enter 2nd Number");
				int n2=sc.nextInt();
				switch(op) {
				case 1:{
					System.out.println("Answer for "+n1+"+"+n2+" is "+(n1+n2));
					break;
				}
				case 2:{
					System.out.println("Answer for "+n1+"-"+n2+" is "+(n1-n2));
					break;
				}
				
				case 3:{
					System.out.println("Answer for "+n1+"*"+n2+" is "+(n1*n2));
					break;
				}
				case 4:{
					System.out.println("Answer for "+n1+"/"+n2+" is "+(n1/n2));
					break;
				}
				case 5:{
					System.out.println("Answer for "+n1+"%"+n2+" is "+(n1%n2));
					break;
				}
				default:System.out.println("Please select given Options");
					
				}
				sc.close();
				}
				else {
					System.out.println("Please select given Options 1/2/3/4/5");
				}
         		}
			catch(Exception e)
			{
			System.out.println("plz enter correct option  run again"); 
			}		
	}
}
