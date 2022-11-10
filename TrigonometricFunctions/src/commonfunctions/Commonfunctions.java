package commonfunctions;

public class Commonfunctions {
	public static final double PI= 3.141592;
	public static long factorial(long n) {
		if (n<=0 || n==1) {
			return 1;
			}
		
		return n* factorial(n-1);
	}

	public static double E(int n) {
		double sum=1;
		long fact = 1;
		for(int i=1;i<n;i++) {
			fact = fact * i; 
			sum+=1.0/fact;
			
		}
		return sum;
	}

	public static double exp(double x, int y) {
		if (y==0) {return 1; }
		double answer=exp(x,y/2);
		if (y%2==0) {
			return answer*answer;
		}
		else 
			return answer*answer*x;
	}

	public static double pow(double x, int y) {
		double answer=exp(x,y);
		if (y<0) {
			return 1/answer;
		}
		return answer;
	}

	public static double DegreeToRadian(double x) {
		x=(2*x*PI)/360;
		return x;
	}

	public static double NRadian (double x)
	{
		return x % (PI*2);
	}
}

