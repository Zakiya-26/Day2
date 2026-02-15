
package leetcode;

public class String13 {
    public static void main(String[] args) {
        String str = "swiss";
        int n = str.length();
        char firstRepeating = '0'; 
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    firstRepeating = str.charAt(i);
                    break; 
                }
            }
            if (firstRepeating != '0') {
                break; 
            }
        }

        if (firstRepeating != '0') {
            System.out.println("First repeating character: " + firstRepeating);
        } else {
            System.out.println("No repeating characters found");
        }
    }
}



