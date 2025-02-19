import java.util.Arrays;

public class Punto2 {
    public void p2(int d) {
        int[][] matriz = new int[d][d];

        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        int numeroMAyor = Metodos.NumMayorDeLaMatriz(matriz);
        System.out.println("El numero mayor es: " + numeroMAyor);
        int[] pos = Metodos.posNumMayor(numeroMAyor, matriz);
        System.out.println("la posicion es: " + Arrays.toString(pos));

    }
}
