import java.util.ArrayList;

public class Punto7 {
    public void p7(int d){
        int[][] matriz = new int[d][d];
        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        System.out.println(Metodos.numeroDeCeros(matriz));
        System.out.println(Metodos.NumerosPositivos(matriz));
        System.out.println(Metodos.NumerosNegativos(matriz));
        ArrayList<Integer> pares = Metodos.NumerosPares(matriz);
        ArrayList<Integer> impares = Metodos.NumerosImpares(matriz);
        Metodos.mostarNumerosPares(pares);
        Metodos.mostarNumerosImpares(impares);
    }
}
