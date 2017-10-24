package main.java.group;

public class Exercise3 {
	public static int triangularNumberSeq(int n){
		int triNum = 0;
		for (int i = 0; i< n; i++) {
			triNum = n*(n+1)/2;
		}
		return triNum;
	}
	
	public static int lazySeq(int n){
		return (int)(Math.pow(n, 2) + n + 2) / 2;
	}
	
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("No valid argument");
			System.exit(1);
		}
		else {
			try {
				int x = triangularNumberSeq(Integer.parseInt(args[0]));
				int y = lazySeq(Integer.parseInt(args[0]));
				System.out.println("Tri(n) =" + x);
				System.out.println("Lazy(n) =" +y);
				
			} catch (NumberFormatException e) {
				System.out.println("Enter an integer");
				System.exit(1);
			}
		}
	}
}