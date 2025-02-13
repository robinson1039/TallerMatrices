import java.util.Arrays;

public class Punto1 {
    public void p1(int d) {
        int[][] matriz = new int[d][d];

        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        int suma = Metodos.sumaNumeros(matriz);
        System.out.println("La suma de los numeros en la matriz es: " + suma);
        int numeroMAyor = Metodos.NumMayor(matriz);
        System.out.println("El numero mayor es: " + numeroMAyor);
        int[] pos = Metodos.posNumMayor(numeroMAyor, matriz);
        System.out.println("la posicion es: " + Arrays.toString(pos));

    }
}
