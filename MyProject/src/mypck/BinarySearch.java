package mypck;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		int[] arr1= {6,3,0,7,4,2,8,5,1};
 		int searchKey = 5;
 		System.out.println("Key "+searchKey+" found at index: "+binarySearch(arr1, searchKey));


 	}
 	public static int binarySearch(int[] list, int key) 
 	{
 		 int low = 0;
 		 int high = list.length - 1;
 		 
 		 while (high >= low) 
 		 {
 			 int mid = (low + high) / 2;
 			 if (key < list[mid])
 			 high = mid - 1;
 			 else if (key == list[mid])
 			 return mid;
 			 else
 			 low = mid + 1;
 		}
 		
 		 return low - 1;
 	}
 }
