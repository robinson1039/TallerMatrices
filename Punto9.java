public class Punto9 {
    public void p9(int d){
        int[][] matriz = new int[d][d];
        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        Metodos.findMax(matriz);
        Metodos.findMin(matriz);
         Metodos.printColumnOfMax(matriz);
        Metodos.printRowOfMax(matriz);
    }
}
