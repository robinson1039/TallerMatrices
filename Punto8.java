import java.util.ArrayList;

public class Punto8 {
    public void p8(int d){
        int[][] matriz = new int[d][d];
        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        ArrayList<Integer> sumafila = Metodos.sumarFilaMatriz(matriz);
        System.out.println("La suma de las filas es: "+ sumafila);
        ArrayList<Integer>sumaCol = Metodos.sumarColMatriz(matriz);
        System.out.println("La suma de las col es: "+sumaCol);
        int numeroMayorFila = Metodos.numMaxArray(sumafila);
        int numeroMayorCol = Metodos.numMaxArray(sumafila);
        System.out.println("La posicion del numero mayor en la col es: "+Metodos.posArrayList(sumaCol, numeroMayorCol));
        System.out.println("La posicion del numero mayor en la fila es: "+Metodos.posArrayList(sumafila, numeroMayorFila));
    }
}
