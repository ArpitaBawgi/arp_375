package program;

public class SampleCalcy {
	 int a;
     int b;
     
public SampleCalcy( int a , int  b){
	 this.a= a;
	 this.b=b;
}
	int add(){
		return (int) (a+b);
	}

  int subtract(){
	  return a-b;
  }

  int multiply(){
	  return a*b;
  }
  int division(){
	  return a/b;
  }
}
