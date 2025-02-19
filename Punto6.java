import java.util.ArrayList;

public class Punto6 {
     public void p6(int d){
        int[][] matriz = new int[d][d];
        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        ArrayList<Integer> resultado = Metodos.sumarColMatriz(matriz);
        resultado.addAll(Metodos.sumarFilaMatriz(matriz));
        System.out.println(resultado);
    }
    
}
