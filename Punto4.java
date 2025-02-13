import java.util.ArrayList;

public class Punto4 {
    public void p4(int d){
        int[][] matriz = new int[d][d];

        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        ArrayList<Integer> sumaCol = Metodos.sumarColMatriz(matriz);
        System.out.println("Array con la suma de las clumnas: "+sumaCol);
        int numMax = Metodos.numMaxArray(sumaCol);
        System.out.println("El numero mayor en el array es:" + numMax);
        int posList = Metodos.posArrayList(sumaCol, numMax);
        System.out.println("La posicion del numero mayor en la lista es:" + posList);
    }
}
