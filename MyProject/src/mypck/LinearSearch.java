package mypck;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {6,3,0,7,4,2,8,5,1};
		int searchKey = 5;
		System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));


	}
	public static int linerSearch(int[] arr, int key){
		
		int size = arr.length;
		for(int i=0;i<size;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
}
