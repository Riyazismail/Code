import java.util.Scanner;

public class Prime {
	

	public static void main(String args[])
	 {
		char[] k = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z' };
		int[] m = new int[26];
		Scanner x = new Scanner(System.in);
		System.out.println("enter the string");
		String s = x.nextLine();
		String ch=s.toLowerCase();
		char[] a = s.toCharArray();
		int len = a.length;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < len; j++) {
				if ((m[i]) == a[j]) {
					m[i]=1;
				}
			}
		}
		int n=0;
		for(int i=0;i<26;i++) {
			if(m[i]!=1) {
				n=1;
			}
		}
		if(n==0) {
			System.out.println("pangram");
		}
		else {
			System.out.println("not a pangram");
		}

	}
}
