package trigofunctions;
import static commonfunctions.Commonfunctions.*;

public class Trigofunctions {
	
	public static double sin(double x) throws Exception {
		x=NRadian(x);
		double sin=x;	
		double sign=-1;
		for(int i=3;i<=23;i+=2) {
			sin+=sign * pow(x, i)/factorial(i);
			sign*=-1;
		}
		return sin;	
	}
	
	public static double cos(double x) throws Exception {
		x=NRadian(x);
		double cos=1;
		double sign=-1;
		for(int i=2;i<=23;i+=2) {
			cos+=sign * pow(x, i)/factorial(i);
			sign*=-1;

		}
		return cos;	
	}
	
	public static double tan(double x) throws Exception {

		   double a= sin(x);
		   double b= cos(x);
		  
		    double tan=(a/b);
			return tan;
		}

} 
