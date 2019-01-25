package factorials;

public class FindingFactorials {
	
	public static int findFactorial() {
	int n=1;
	int x=3628800;
	
	while (x % n ==0) {
		x = x/n;
		n++;
	}
		return x;
	
	}

}
