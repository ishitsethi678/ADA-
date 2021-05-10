package ada;
import java.util.*;
class sort2DMatrixbycolumn {

 // Function to sort by column
 public static void sortbyColumn(int arr[][], int col)
 {
    /* //function used
     Arrays.sort(arr, new Comparator<int[]>() {
         
                  
       // Compare values according to columns
       public int compare(final int[] entry1, 
                          final int[] entry2) {

         // To sort in descending order revert 
        
         if (entry1[col] > entry2[col])
             return 1;
         else
             return -1;
       }
     }); */
	 for(int k=0;k<4;k++) {
		 for(int i=0;i<4;i++) {
			 for(int j=i+1;j<4;j++) {
				 if(arr[i][k]>arr[j][k]) {
					 int temp=arr[j][k];
					 arr[j][k]=arr[i][k];
					arr[i][k]=temp;
				 }
			 }
		 }
	 }
 } 
 
 public static void main(String args[])
 {
     int matrix[][] = { { 39, 27, 11, 42 },
                        { 10, 93, 91, 90 },
                        { 54, 78, 56, 89 },
                        { 24, 64, 20, 65 } };
     // Sorting the 3rd Column
     int col = 3;
     sortbyColumn(matrix, col - 1);

     // Displaying sorted matrix
     for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++)
             System.out.print(matrix[i][j] + " ");
         System.out.println();
     }
 }
}
