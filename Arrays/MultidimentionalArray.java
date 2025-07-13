package Arrays;

public class MultidimentionalArray {
    public static void main(String[] args) {
        // Creating a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in a 2D array
        System.out.println( matrix[0][0]); // Output: 1
        System.out.println( matrix[1][2]); // Output: 6

        // Iterating through a 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // lets create an multidimentional array using new keyword .
        int[][] multiArray = new int[3][4]; // 3 rows and 4 columns
        // lets give values to the array using math random method.
        for (int i =0; i  < 3; i++) {
               for (int j = 0; j < 4; j++) {
                   multiArray[i][j] = (int)(Math.random() * 100); // math.random() generates a random number between 0.0 and 1.0, multiplying by 100 gives a range of 0 to 99.} then we use type casting to convert it to int.
                   System.err.print(multiArray[i][j] + " "); // print the value of the array.
                }   
                System.err.println();
        }
     }
}