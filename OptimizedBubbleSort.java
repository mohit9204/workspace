import java.util.Arrays;

	public class OptimizedBubbleSort {
	    static void sort(int [] arr){
	        if(arr==null || arr.length==0)
	            return;

	        System.out.println("Original Array: " + Arrays.toString(arr));
	        boolean isSwapped;
	        int n = arr.length;
	        for(int i=0; i < n; i++){ 
	        	isSwapped=false;
                for(int j=1; j < (n-i); j++){  
                         if(arr[j-1] > arr[j]){  
                                //swap elements  
                               int  temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                                isSwapped=true;
                        }  
                         
                }  
	            //check if any swapping occurred in last iteration
	            //if yes then break the loop, array is sorted at this point
	            if(isSwapped==false)
	                break;
	        }
	        System.out.println("Sorted Array: " +  Arrays.toString(arr));
	    }

	    public static void main(String[] args) {
	      //  int [] arrA = {5, 1, 9, 3, 2, 10};
	        //sort(arrA);
	        System.out.println("------------------------------");
	       int[] arrA = new int []{1, 2, 4, 6, 8, 10};
	        sort(arrA);
	    }
	}

