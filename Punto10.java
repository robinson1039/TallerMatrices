public class Punto10 {
    public void p10(int d){
        int[][] matriz = new int[d][d];
        Metodos.llenarMatriz(matriz);
        System.out.println("Matriz generada:");
        Metodos.mostrarMatriz(matriz);
        System.out.println("Matriz de cadenas:");
        Metodos.printMatrix(matriz);

        System.out.println("Matriz de cantidad de dígitos:");
        Metodos.printMatrix(matriz);
    }
}
