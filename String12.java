package leetcode;

public class String12 {

	public static void main(String[] args) {
		String str="madam";
		int n=str.length();
		boolean isprime=true;
		for(int i=0;i<n/2;i++) {
			char c=str.charAt(i);
			if(c!=str.charAt(n-1-i)) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			System.out.println("the given String is boolean");
	}
		else {
			System.out.println("the given String is not boolean:");
		}

}
}

