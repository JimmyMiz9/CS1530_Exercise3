import java.util.*;

public class Exercise3 {
	public int triangularNumberSeq(int n){
		int triNum = 0;
		for (int i = 0; i< n; i++) {
			triNum = n*(n+1)/2;
		}
		return triNum;
	}
	
	public int lazySeq(int n){
		return (int)(Math.pow(n, 2) + n + 2) / 2;
	}
	public static void main(String[] args) {
		Exercise3 seq = new Exercise3();
		System.out.println(seq.triangularNumberSeq(5));
		System.out.println(seq.lazySeq(5));
		
	}
}