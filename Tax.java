package com.arpita.java;
import java.util.*;

public class Tax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sal, tax=0;
		
		System.out.println("Enter the salary: ");
		sal=sc.nextInt();
		if(sal>0 && sal<180000)
		{
		tax=tax*0;
		System.out.println("Tax to be paid is: "+tax);
		}
		else if(sal>=181001 && sal<300000)
		{
		tax=sal*(10/100);
		System.out.println("Tax to be paid is: "+tax);
		}
		else if(sal>=300001 && sal<500000)
		{
		tax=sal*(20/100);
		System.out.println("Tax to be paid is: "+tax);
		}
		else if(sal>=500001 && sal<1000000)
		{
		tax=sal*(30/100);
		System.out.println("Tax to be paid is: "+tax);
		}
		else {
			System.out.println("The input is invalid");
		}
	}

}
