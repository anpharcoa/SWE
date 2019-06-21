import java.util.Arrays;

public class main {
	static void bubbleSort (int arr[]) {
		int n=arr.length;
		int temp;
		for (int i=0;i<n-1;i++) {         // thuật toán bubble sort bình thường ,sử dụng biến temp để đổi vị trí
			for (int j=0;j<n-i-1;j++) 
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			System.out.println(Arrays.toString(arr)); // print step after 1 sort
		}
	}
	public static void main(String[] args) {
		int arr[] = {5, 1, 12, -5, 16} ;
		System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println(); 
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        for (int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
