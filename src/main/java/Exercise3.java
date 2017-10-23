public class Exercise3 {
	
	public int triangularNumberSeq(int n){
		int triNum = 0;
		for (int i = 0; i< n; i++) {
			triNum = n*(n+1)/2;
		}
		return triNum;
	}

	public int lazyCatererSeq(int n){
		return (int)(Math.pow(n, 2) + n + 2) / 2;
	}

	public static void main(String[] args) {
		Exercise3 tri = new Exercise3();
		//Exercise3 lzc = new Exercise3();
		//System.out.println(lzc.lazyCatererSeq(5));
		System.out.println(tri.triangularNumberSeq(5));
	}
}