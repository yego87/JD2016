package by.it.daylidovich.JD01_04.SLAY;

public class SLAY {
    public static double[] FindRoot(double[][] A, double[] M){

        int n = A.length;
        double[][] matrix = new double[n][n+1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = A[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            matrix[i][n] = M[i];
        }

        for (int diag = 0; diag < n - 1; diag++) {
            for (int row = diag+1; row < n; row++) {
                double k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < n + 1; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col]*k;
                }
            }
        }

        for (int diag = n-1; diag > 0; diag--) {
            for (int row = 0; row < diag; row++) {
                double k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < n + 1; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col]*k;
                }
            }
        }

        for (int row = 0; row < n; row++) {
            double k = 1/matrix[row][row];
            for (int col = 0; col < n+1; col++) {
                matrix[row][col] = matrix[row][col]*k;
            }
        }

        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = matrix[i][n];
        }

        return x;
    }
    public static double Determinant(double[][] matrixIn){
        int n = matrixIn.length;
        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrixIn[i][j];
            }
        }

        for (int diag = 0; diag < n - 1; diag++) {
            for (int row = diag+1; row < n; row++) {
                double k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < n; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col]*k;
                }
            }
        }

        double determ = 1;
        for (int i = 0; i < n; i++) {
            determ = determ * matrix[i][i];
        }

        return determ;
    }
    public static double[][] InverseMatrix(double[][] matrixIn){
        int n = matrixIn.length;

        double[][] matrix = new double[n][2*n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrixIn[i][j];
            }
        }
        for (int i = n; i <2*n; i++) {
            matrix[i-n][i] = 1;
        }

        for (int diag = 0; diag < n - 1; diag++) {
            for (int row = diag+1; row < n; row++) {
                double k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < 2*n; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col]*k;
                }
            }
        }

        for (int diag = n-1; diag > 0; diag--) {
            for (int row = 0; row < diag; row++) {
                double k = matrix[row][diag]/matrix[diag][diag];
                for (int col = 0; col < 2*n; col++) {
                    matrix[row][col] = matrix[row][col] - matrix[diag][col]*k;
                }
            }
        }

        for (int row = 0; row < n; row++) {
            double k = 1/matrix[row][row];
            for (int col = 0; col < 2*n; col++) {
                matrix[row][col] = matrix[row][col]*k;
            }
        }

        double[][] identityMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n; j < 2*n ; j++) {
                identityMatrix[i][j-n] = matrix[i][j];
            }
        }
        return identityMatrix;
    }
}
