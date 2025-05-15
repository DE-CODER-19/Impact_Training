package train;
import java.util.Arrays;
public class Sort {

	



	public static void main(String[] args) {
		
	
			
			int [] arr = new int [] {2,5,1,3,4};
			sortIntArray(arr);
			
			char[] arr_char = new char [] {'b','d','a','g','d'};
			
			System.out.println(Arrays.toString(arr));
			
			
				System.out.println("pass:"+i+" =>"+Arrays.toString(arr));
		}
		}
		public static void sortIntArray(int[]arr,int i , int j) {
			for(int  i = 0 ; i<arr.length ; i++) {
				for (int  j = i+1 ; j <arr.length;j++) {
					if (arr [j]<arr[i]) {
						swap(arr,i,j);
					}
				}
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}

		}


	}
	swap()
}
public static void swap(char[]arr,int i , int j) {
 char temp = arr[i];
	arr[i]= arr[j];
	arr[j] = temp;
}
}


