public class MatrixFunctions {

    public static float[][] initialiseMatrix(int n){
        float[][] matrix = new float[n][n];
        for (int i=0; i<n; i++){
            matrix[i][i] = 1.0f;
        }
        return matrix;
    }

    public static float[][] transposeMatrix(float[][] matrix){
        int n = matrix.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                float temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    public static String matrixToString(float[][] matrix){
        String output = "";
        for (float[] row : matrix){
            output += "\n";
            for (float value : row){
                output += (value + " ");
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Testing unit matrix with n=3, expecting:" +
                "\n1.0 0.0 0.0 " +
                "\n0.0 1.0 0.0 " +
                "\n0.0 0.0 1.0 ");
        float[][] matrix3 = initialiseMatrix(3);
        if (matrixToString(matrix3).equals("\n1.0 0.0 0.0 \n0.0 1.0 0.0 \n0.0 0.0 1.0 ")) {
            System.out.println("Test Successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing matrix transpose, expecting:");
        float[][] matrix4 = {{1.0f, 2.0f, 3.0f, 4.0f},
                {5.0f, 6.0f, 7.0f, 8.0f},
                {9.0f, 10.0f, 11.0f, 12.0f},
                {13.0f, 14.0f, 15.0f, 16.0f}
        };
        String testString = "\n1.0 5.0 9.0 13.0 " +
                "\n2.0 6.0 10.0 14.0 " +
                "\n3.0 7.0 11.0 15.0 " +
                "\n4.0 8.0 12.0 16.0 ";
        System.out.print(testString);
        float[][] transposedMatrix = transposeMatrix(matrix4);
        System.out.println(matrixToString(transposedMatrix));
        if (matrixToString(transposedMatrix).equals(testString)){
            System.out.println("Test Successful");
        } else {
            System.out.println("Test failed");
        }
    }
}
