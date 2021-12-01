
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[6];
		System.out.println("Enter 6 elements: ");
		
		for(int i = 0; i < 6; i++) {
			int el = input.nextInt();
			arr[i] = el;
		}
		
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
