import java.util.ArrayList;

public class Punto3 {
    public void p3(int d){
        int[][] matriz = new  int[d][d];
        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        ArrayList<Integer> sumafila = (ArrayList<Integer>) Metodos.sumarFilaMatriz(matriz);
        System.out.println("La suma de las filas es: "+ sumafila);
        ArrayList<Integer>sumaCol = Metodos.sumarColMatriz(matriz);
        System.out.println("La suma de las col es: "+sumaCol);

    }
}
