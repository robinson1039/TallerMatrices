import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metodos {

    public static void llenarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumaNumerosDelaMAtriz(int[][] matriz){
        int sumaTotal = 0;
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                sumaTotal += anInt;
            }
        }
        return sumaTotal;
    }

    public static int NumMayorDeLaMatriz(int[][] matriz){
        ArrayList<Integer>numerosMatriz = new ArrayList<>();
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                numerosMatriz.add(anInt);
            }
        }
        return Collections.max(numerosMatriz);
    }

    public static int NumMenorDeLaMatriz(int[][] matriz){
        ArrayList<Integer>numerosMatriz = new ArrayList<>();
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                numerosMatriz.add(anInt);
            }
        }
        return Collections.min(numerosMatriz);
    }

    public static int[] posNumMayor(int p, int[][] matriz) {
        int fila = -1;
        int columna = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == p) {
                    fila = i;
                    columna = j;
                    return new int[]{fila, columna}; // Retorna la primera coincidencia encontrada
                }
            }
        }

        return new int[]{fila, columna}; // Si no se encuentra, devuelve {-1, -1}
    }

    public static ArrayList<Integer> sumarFilaMatriz(int[][] matriz) {
        ArrayList<Integer> sumaFila = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            int sumarCadafila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumarCadafila += matriz[i][j];
            }
            sumaFila.add(sumarCadafila);
        }
        return sumaFila;
    }

    public static ArrayList<Integer> sumarColMatriz(int[][] matriz) {
        int columnas = matriz[0].length; // Número de columnas
        ArrayList<Integer> sumaColumnas = new ArrayList<>();
        for (int j = 0; j < columnas; j++) {
            int sumaColumnaActual = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnaActual += matriz[i][j]; // Sumar elementos de la columna `j`
            }

            sumaColumnas.add(sumaColumnaActual);
        }

        return sumaColumnas;
    }

    public static int numMaxArray(List<Integer> lista){
        return Collections.max(lista);
    }

    public static int posArrayList(List<Integer> lista, int maxValue){
        int iteracion = 0;
        for (int lis: lista){
            iteracion++;
            if(lis == maxValue){
                return iteracion;
            }
        }
        return iteracion;
    }

    public static ArrayList<Integer> MatrizArray(int[][] matriz){
        ArrayList<Integer>matrizArray = new ArrayList<>();
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                matrizArray.add(anInt);
            }
        }
        return matrizArray;
    }

    public static ArrayList<Integer> NumerosPares(int[][] matriz) {
        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    numerosPares.add(matriz[i][j]);
                }
            }
        }
        return numerosPares;
    }

    public static ArrayList<Integer> NumerosNegativos(int[][] matriz) {
        ArrayList<Integer> numerosNegativos = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    numerosNegativos.add(matriz[i][j]);
                }
            }
        }
        return numerosNegativos;
    }

    public static ArrayList<Integer> NumerosPositivos(int[][] matriz) {
        ArrayList<Integer> numerosPositivos = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 0) {
                    numerosPositivos.add(matriz[i][j]);
                }
            }
        }
        return numerosPositivos;
    }

    public static ArrayList<Integer> NumerosImpares(int[][] matriz) {
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        // Recorremos toda la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    numerosImpares.add(matriz[i][j]);
                }
            }
        }
        return numerosImpares;
    }

    public static void mostarNumerosPares(ArrayList<Integer> pares) {
        System.out.println("Los números pares en la matriz son: " + pares);
    }

    public static void mostarNumerosImpares(ArrayList<Integer> impares) {
        System.out.println("Los números impares en la matriz son: " + impares);
    }

    public static ArrayList<Integer> numeroDeCeros(int[][] matriz) {
        ArrayList<Integer> ceros = new ArrayList<>();

        // Recorremos toda la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    ceros.add(matriz[i][j]);
                }
            }
        }
        return ceros;
    }

    public static void findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int row = -1, col = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Máximo valor: " + max + " en la posición (" + row + ", " + col + ")");
    }

    public static void findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int row = -1, col = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Mínimo valor: " + min + " en la posición (" + row + ", " + col + ")");
    }

    public static void printColumnOfMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int colIndex = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    colIndex = j;
                }
            }
        }
        System.out.println("Columna donde se encuentra el máximo valor:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][colIndex]);
        }
    }

    public static void printRowOfMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowIndex = i;
                }
            }
        }
        System.out.println("Fila donde se encuentra el máximo valor:");
        for (int j = 0; j < matrix[rowIndex].length; j++) {
            System.out.print(matrix[rowIndex][j] + " ");
        }
        System.out.println();
    }

    public static int countDigits(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
