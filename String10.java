package leetcode;

public class String10 {

	public static void main(String[] args) {
		String str="programming";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				char c=str.charAt(i);
				char s=str.charAt(j);
				if(c==s) {
					System.out.print(c);
					return;
				}
				
			}
		}
	}

}
