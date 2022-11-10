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
		assertEquals(Math.toRadians(50),  DegreeToRadian(50), decimalpoints); //first quadrant
		assertEquals(Math.toRadians(100), DegreeToRadian(100), decimalpoints); //second quadrant
		assertEquals(Math.toRadians(240), DegreeToRadian(240), decimalpoints); //third quadrant
		assertEquals(Math.toRadians(320), DegreeToRadian(320), decimalpoints); //fourth quadrant
		System.out.println("Degree to Radian all quadrants success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}

	@Test
	void sin_degree() {
		try {
		assertEquals(Math.sin(2), sin(2), decimalpoints);
		System.out.println("\n\nSin degree Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
		@Test
	void sin_all_quadrants() {
		try {
		assertEquals(Math.sin(Math.toRadians(55)), sin(DegreeToRadian(55)), decimalpoints); //first quadrant
		assertEquals(Math.sin(Math.toRadians(122)),sin(DegreeToRadian(122)), decimalpoints);//second quadrant
		assertEquals(Math.sin(Math.toRadians(242)),sin(DegreeToRadian(242)), decimalpoints);//third quadrant
		assertEquals(Math.sin(Math.toRadians(301)),sin(DegreeToRadian(301)), decimalpoints);//fourth quadrant
		System.out.println("Sin all quadrant Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	@Test
	void cos_degree() {
		try {
		assertEquals(Math.cos(2), cos(2), decimalpoints);
		System.out.println("\n\nCos degree Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	@Test
	void cos_all_quadrant() {
		try {
			assertEquals(Math.cos(Math.toRadians(55)), cos(DegreeToRadian(55)), decimalpoints); //first quadrant
			assertEquals(Math.cos(Math.toRadians(122)),cos(DegreeToRadian(122)), decimalpoints);//second quadrant
			assertEquals(Math.cos(Math.toRadians(242)),cos(DegreeToRadian(242)), decimalpoints);//third quadrant
			assertEquals(Math.cos(Math.toRadians(301)),cos(DegreeToRadian(301)), decimalpoints);//fourth quadrant
			System.out.println("Cos all quadrant Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	@Test
	void tan_degree() {
		try {
		assertEquals(Math.tan(2), tan(2), decimalpoints);
		System.out.println("\n\nTan degree Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}
	
	@Test
	void tan_all_quadrants() {
		try {
			assertEquals(Math.tan(Math.toRadians(55)), tan(DegreeToRadian(55)), decimalpoints); //first quadrant
			assertEquals(Math.tan(Math.toRadians(122)),tan(DegreeToRadian(122)), decimalpoints);//second quadrant
			assertEquals(Math.tan(Math.toRadians(242)),tan(DegreeToRadian(242)), decimalpoints);//third quadrant
			assertEquals(Math.tan(Math.toRadians(301)),tan(DegreeToRadian(301)), decimalpoints);//fourth quadrant
			System.out.println("Tan all quadrant Success");
		}
		catch(AssertionError e){
			System.out.println("Fail");
		}
		
	}

	}