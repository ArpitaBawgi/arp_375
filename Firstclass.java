package com.arpita.ds;

public class Firstclass {

	        int empid;
	        String ename;
	        int eage;

	Firstclass(){
	 empid=1522;
	 ename="akash";
	  eage=10;
}
	
	Firstclass(int empid, String ename, int eage){
		this.empid=empid;
		this.ename=ename;
		this.eage=eage;
		
	}

public void getEmployeeDetails()
{
	System.out.println(empid);
	System.out.println(ename);
	System.out.println(eage);
}
}



 