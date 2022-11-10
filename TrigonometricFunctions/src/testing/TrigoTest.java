package testing;
import static commonfunctions.Commonfunctions.*;
import static trigofunctions.Trigofunctions.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrigoTest {
	double decimalpoints=0.01;


	
	@Test
	void degree_to_radian_all_quadrant() {
		try {
		assertEquals(Math.toRadians(50),  DegreeToRadian(50), decimalpoints); //Check degree to radiant conversion in 1st quadrant
		assertEquals(Math.toRadians(100), DegreeToRadian(100), decimalpoints); //Check degree to radiant conversion in 2nd quadrant
		assertEquals(Math.toRadians(240), DegreeToRadian(240), decimalpoints); //Check degree to radiant conversion in 3rd quadrant
		assertEquals(Math.toRadians(320), DegreeToRadian(320), decimalpoints); //Check degree to radiant conversion in 4th quadrant
		System.out.println("Degree to Radian all quadrant success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}

	@Test
	void sin_value() throws Exception {
		try {
		assertEquals(Math.sin(2), sin(2), decimalpoints);
		System.out.println("\nSin value Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
		@Test
	void sin_all_quadrants() throws Exception {
		try {
		assertEquals(Math.sin(Math.toRadians(55)), sin(DegreeToRadian(55)), decimalpoints); //Check value of sin in 1st quadrant
		assertEquals(Math.sin(Math.toRadians(122)),sin(DegreeToRadian(122)), decimalpoints);//Check value of sin in 2nd quadrant
		assertEquals(Math.sin(Math.toRadians(242)),sin(DegreeToRadian(242)), decimalpoints);//Check value of sin in 3rd quadrant
		assertEquals(Math.sin(Math.toRadians(301)),sin(DegreeToRadian(301)), decimalpoints);//Check value of sin in 4th quadrant
		System.out.println("Sin all quadrants Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	@Test
	void cos_value() throws Exception {
		try {
		assertEquals(Math.cos(2), cos(2), decimalpoints);
		System.out.println("Cos value Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	@Test
	void cos_all_quadrants() throws Exception {
		try {
			assertEquals(Math.cos(Math.toRadians(55)), cos(DegreeToRadian(55)), decimalpoints); //Check value of cos in 1st quadrant
			assertEquals(Math.cos(Math.toRadians(122)),cos(DegreeToRadian(122)), decimalpoints);//Check value of cos in 2nd quadrant
			assertEquals(Math.cos(Math.toRadians(242)),cos(DegreeToRadian(242)), decimalpoints);//Check value of cos in 3rd quadrant
			assertEquals(Math.cos(Math.toRadians(301)),cos(DegreeToRadian(301)), decimalpoints);//Check value of cos in 4th quadrant
			System.out.println("Cos all quadrants Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	@Test
	void tan_value() throws Exception {
		try {
		assertEquals(Math.tan(2), tan(2), decimalpoints);
		System.out.println("\nTan value Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	
	@Test
	void tan_all_quadrants() throws Exception {
		try {
			assertEquals(Math.tan(Math.toRadians(55)), tan(DegreeToRadian(55)), decimalpoints); //Check value of tan in 1st quadrant
			assertEquals(Math.tan(Math.toRadians(122)),tan(DegreeToRadian(122)), decimalpoints);//Check value of tan in 2nd quadrant
			assertEquals(Math.tan(Math.toRadians(242)),tan(DegreeToRadian(242)), decimalpoints);//Check value of tan in 3rd quadrant
			assertEquals(Math.tan(Math.toRadians(301)),tan(DegreeToRadian(301)), decimalpoints);//Check value of tan in 4th quadrant
			System.out.println("Tan all quadrants Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}	
	}
