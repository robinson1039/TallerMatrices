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

    public static int sumaNumeros(int[][] matriz){
        int sumaTotal = 0;
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                sumaTotal += anInt;
            }
        }
        return sumaTotal;
    }

    public static int NumMayor(int[][] matriz){
        ArrayList<Integer>numerosMatriz = new ArrayList<>();
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                numerosMatriz.add(anInt);
            }
        }
        return Collections.max(numerosMatriz);
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
}
