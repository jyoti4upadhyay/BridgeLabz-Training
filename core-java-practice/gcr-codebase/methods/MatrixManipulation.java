import java.util.Random;
public class MatrixManipulation{
    //Random matrix creation
    public static double[][] createMatrix(int rows,int cols){
        Random rand=new Random();
        double[][] matrix=new double[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=rand.nextInt(10)+1;
            }
        }
        return matrix;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static double[][] Transpose(double[] matrix[]) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        double[][] transpose=new double[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;  
    }
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
      
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) {
            System.out.println("Inverse not possible (Determinant is 0)");
            return null;
        }

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Inverse not possible (Determinant is 0)");
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Main method
    public static void main(String[] args) {

        // 2x2 Matrix
        double[][] matrix2 = createMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2);

        System.out.println("Transpose:");
        displayMatrix(Transpose(matrix2));

        System.out.println("Determinant: " + determinant2x2(matrix2));

        System.out.println("Inverse:");
        double[][] inv2 = inverse2x2(matrix2);
        if (inv2 != null) displayMatrix(inv2);

        // 3x3 Matrix
        double[][] matrix3 = createMatrix(3, 3);
        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3);

        System.out.println("Transpose:");
        displayMatrix(Transpose(matrix3));

        System.out.println("Determinant: " + determinant3x3(matrix3));

        System.out.println("Inverse:");
        double[][] inv3 = inverse3x3(matrix3);
        if (inv3 != null) displayMatrix(inv3);
    }
}

