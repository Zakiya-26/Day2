package leetcode;

public class String11 {

	public static void main(String[] args) {
		String str= "I Love Competitive Programming";
		String[] s=str.split(" ");
		String lon=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>lon.length()) {
				lon=s[i];
			}
		}
			System.out.println("longest word:"+lon);
	}

}
