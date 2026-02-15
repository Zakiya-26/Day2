package leetcode;

public class String8 {

	public static void main(String[] args) {
		String str="I love Java";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if( (c>='a'&&c<='z'||c>='A'&&c<='Z'||c>=0&&c<=9)){
				System.out.print(c);
			}
			else {
				continue;
			}
		}

	}

}
