package Sorting;
public class BubbleSort {
	 static void bubbleSort(int[] arr) {  
	        int N1 = arr.length;  
	        int temp1 = 0;  
	         for(int i=0; i < N1; i++){  
	                 for(int j=1; j < (N1-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp1 = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp1;  
	                         }
	                 }
	         }
	                          
	                   
	         }  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int array1[] ={7,67,37,23,48,310,59};  
          
          System.out.println("Array Before Bubble Sort");  
          for(int i=0; i < array1.length; i++){  
                  System.out.print(array1[i] + " ");  
          }  
          System.out.println();  
            
          bubbleSort(array1);//sorting array elements using bubble sort  
           
          System.out.println("Array After Bubble Sort");  
          for(int i=0; i < array1.length; i++){  
                  System.out.print(array1[i] + " ");  
          }  

   
		

	}

}
