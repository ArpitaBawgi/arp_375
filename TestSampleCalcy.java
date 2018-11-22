package program;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestSampleCalcy {
	SampleCalcy simp=null;

	/*
	@Test
	public void test() {
		assertEquals(60, simp.add(),0);//50 is expected value, simp.add->actual value, 0 is difference;
		                               //if expected==actual, diff=0, ur results are correct
		assertEquals(70,simp.add(),10);//60 is expected output which is actual wrong per addition of 20+30, but in some case we would like to have have somw deviations hence we can add that in diff, so here diff(expctd-actual)=10,instead of 0	
        assertEquals(20,simp.subtract(),0);
        assertEquals(800,simp.multiply(),0);
       // assertEquals(60,simp.multiply(), 0);//condtn here is false hence the whole output is shown in red colour;
        assertEquals(2,simp.division(),0);
        assertEquals(3,simp.division(),1);//here 40/20=2 but i want to add deviations hence i made output as 3 and made diff as 1 instead of 0
                                          //so in this way u can add a range for expected deviations
	    
	*/
	
	
	@Before
	public void before(){
		System.out.println("before");
		simp=new SampleCalcy(40,20);
	}
	@After
	public void after(){
		System.out.println("after");
		simp=null;
	}
	@Test
	public void test1(){
		System.out.println("test1");
		assertEquals(60, simp.add(),0);
		assertEquals(70,simp.add(),10);
		 assertEquals(20,simp.subtract(),0);
	}
	@Test
	public void test2(){
		System.out.println("test2");
		assertEquals(800,simp.multiply(),0);
		assertEquals(2,simp.division(),0);
	}
	@Ignore
 public	void ignore(){
		assertEquals(3,simp.division(),1);
	}
	
	}   


