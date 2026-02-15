package leetcode;

public class String14 {
    public static void main(String[] args) {
        String str = "swiss";

        int[] freq = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != 0)
            System.out.println(result);
        else
            System.out.println("No unique character");
    }
}
