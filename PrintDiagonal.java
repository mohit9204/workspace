
public class PrintDiagonal {
public static void main(String[] args) {
	 int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	int m = 4,n=4;
for (int k = 0; k <=m-1; k++) {
     int i=k;
     int j=0;
     while(i>=0){
    	 System.out.println("Array element "+ arr[i][j]);
    	 i=i-1;
    	 j=j+1;
     }
	
}	
for (int k = 1; k <=n-1; k++) {
	int i=m-1;
	int j=k;
	while(j<=n-1){
		 System.out.println("Array element "+ arr[i][j]);
    	 i=i-1;
    	 j=j+1;
	}
	
}
}

}
