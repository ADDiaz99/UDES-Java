package Programacion_1.MetodoHungaroGUI;

// Clase encargada de la logica
    public class MetodoHungaro {

    public static int[] solve(int[][] costMatrix) {
        int n = costMatrix.length;
        int[][] matrix = new int[n][n];
        int[] result = new int[n];
        boolean[] rowCovered = new boolean[n];
        boolean[] colCovered = new boolean[n];
        
        // 1. Copiar la matriz original
        for (int i = 0; i < n; i++) {
            System.arraycopy(costMatrix[i], 0, matrix[i], 0, n);
        }

        // 2. Reducción de filas
        for (int i = 0; i < n; i++) {
            int minVal = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }
            for (int j = 0; j < n; j++) {
                matrix[i][j] -= minVal;
            }
        }

        // 3. Reducción de columnas
        for (int j = 0; j < n; j++) {
            int minVal = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                matrix[i][j] -= minVal;
            }
        }

        // 4. Cubrir ceros y encontrar una solución inicial
        boolean done = false;
        while (!done) {
            done = coverZeros(matrix, rowCovered, colCovered);
            if (!done) {
                adjustMatrix(matrix, rowCovered, colCovered);
            }
        }

        // 5. Asignar trabajos basados en la matriz de ceros
        assignTasks(matrix, result);
        
        return result;
    }

    private static boolean coverZeros(int[][] matrix, boolean[] rowCovered, boolean[] colCovered) {
        System.out.println("Ejecutando coverZeros...");

        int n = matrix.length;
        // Reiniciar coberturas
        for (int i = 0; i < n; i++) {
            rowCovered[i] = false;
            colCovered[i] = false;
        }
        
        // Cubrir cada cero único en cada fila
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0 && !rowCovered[i] && !colCovered[j]) {
                    rowCovered[i] = true;
                    colCovered[j] = true;
                    break;
                }
            }
        }
        
        // Contar el número de columnas cubiertas
        int coveredColumns = 0;
        for (boolean covered : colCovered) {
            if (covered) coveredColumns++;
        }
        
        return coveredColumns >= n;
    }

    private static void adjustMatrix(int[][] matrix, boolean[] rowCovered, boolean[] colCovered) {
        System.out.println("Ejecutando adjustMatrix...");
        int n = matrix.length;
        int minVal = Integer.MAX_VALUE;
        
        // Encontrar el valor mínimo no cubierto
        for (int i = 0; i < n; i++) {
            if (!rowCovered[i]) {
                for (int j = 0; j < n; j++) {
                    if (!colCovered[j] && matrix[i][j] < minVal) {
                        minVal = matrix[i][j];
                    }
                }
            }
        }

        // Restar minVal de todas las filas no cubiertas y sumar a las columnas cubiertas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!rowCovered[i] && !colCovered[j]) {
                    matrix[i][j] -= minVal;
                } else if (rowCovered[i] && colCovered[j]) {
                    matrix[i][j] += minVal;
                }
            }
        }
    }

    private static void assignTasks(int[][] matrix, int[] result) {
        int n = matrix.length;
        boolean[] rowAssigned = new boolean[n];
        boolean[] colAssigned = new boolean[n];
        
        // Asignar ceros únicos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0 && !rowAssigned[i] && !colAssigned[j]) {
                    result[i] = j;
                    rowAssigned[i] = true;
                    colAssigned[j] = true;
                    break;
                }
            }
        }
    }
}
