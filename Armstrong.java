package com.arpita.ds;

import java.util.*;

public class Armstrong {
	
 public void armStr(){
Scanner ac=new Scanner(System.in);
int temp;
int r;
int res=0;
System.out.println("Enter the number: ");

int n=ac.nextInt();



temp=n;
while(n>0)
{
	r=n%10;
	res=res+(r*r*r);
	n=n/10;
	}
if(res==n)
{
	System.out.println("The given number is Armstrong");}
else{
	System.out.println("The given number is NOT Armstrong");}
}
}