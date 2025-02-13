public class Punto5 {
    public void p4(int d){
        int[][] matriz = new int[d][d];

        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        System.err.println(Metodos.MatrizArray(matriz));
    }
}
