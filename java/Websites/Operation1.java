package Websites;

public class Operation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		System.out.println(i);
		int j = ++i - --i;
		System.out.println(j);
		int k = j-- - --i + --i - --j;
		System.out.println(k);
		int l = --k - k-- + i-- - --i + j++ - --j;
		System.out.println(l);
	}

}
