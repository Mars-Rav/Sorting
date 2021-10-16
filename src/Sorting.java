
public class Sorting {

	public static void main(String[] args) {
		
		int arr[] = {5, 9, 1, 2, 6, 8, 3, 7 ,4};
		
		sort(arr);
		print(arr);

	}
	
	public static int[] sort(int arr[]) {
		
		for(int i = 0; i < arr.length-1; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return 	arr;
	}
	
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}
