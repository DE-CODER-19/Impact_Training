package train;

public class SortTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] roll = new int[] {3,1,5,6,2,4};
		String[] names = new String[] {"rajesh","aman","ravi","john","david","nirav"};
		
		   

		        int n = roll.length;

		        // Bubble Sort
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n-1-i ; j++) {
		                if (roll[j] > roll[j + 1]) {
		                    // Swap roll numbers
		                    int tempRoll = roll[j];
		                    roll[j] = roll[j + 1];
		                    roll[j + 1] = tempRoll;

		                    // Swap corresponding names
		                    String tempName = names[j];
		                    names[j] = names[j + 1];
		                    names[j + 1] = tempName;
		                }
		            }
		        }

		        // Print sorted result
		        System.out.println("Sorted roll numbers and names:");
		        for (int i = 0; i < n; i++) {
		            System.out.println(roll[i] + " - " + names[i]);
		        }
		    }
		

		}
	

