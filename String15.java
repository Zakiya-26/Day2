package leetcode;

public class String15 {

	public static void main(String[] args) {
		String str="I am learning java programming";
		String[] s=str.split(" ");
		String max=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>max.length()) {
				max=s[i];
				
			}
			
		}
		System.out.println(max);
	}

}
