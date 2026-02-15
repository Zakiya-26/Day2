package leetcode;

public class Practice6 {

	public static void main(String[] args) {
		int[] arr= {1,12,3,94,5};
		 int max=Integer.MIN_VALUE;
		 int secmax=Integer.MIN_VALUE;;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>max) {
				 secmax=max;
				 max=arr[i];
			 }
			 else if (arr[i] > secmax && arr[i] < max) {
	               
	                secmax = arr[i];
	            }
	        }

	        System.out.println("Largest: " + max);
	        System.out.println("Second Largest: " + secmax);
	    }
	

		 }
		 


