package leetcode;

public class String9 {

	public static void main(String[] args) {
		String str="programming";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='m') {
			count++;
		}
		}
		System.out.print(count);
	}

}
