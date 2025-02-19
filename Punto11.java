import java.util.Scanner;

public class Punto11 {
    public static void p11() {
        Scanner scanner = new Scanner(System.in);

        // 1. Leer la cantidad de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int n = scanner.nextInt();

        double[][] calificaciones = new double[n][5]; // Matriz de Nx5
        double[] promedios = new double[n]; // Almacena promedios de cada estudiante

        // 2. Ingresar calificaciones
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las calificaciones para el estudiante " + (i + 1) + ":");
            double suma = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
                suma += calificaciones[i][j]; // Acumular para el promedio
            }
            promedios[i] = suma / 5;
        }

        // 3. Mostrar el promedio de cada estudiante
        System.out.println("\nPromedio de cada estudiante:");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
        }

        // 4. Encontrar estudiantes con la mejor nota en el examen 3
        double mejorNota3 = -1;
        for (int i = 0; i < n; i++) {
            if (calificaciones[i][2] > mejorNota3) {
                mejorNota3 = calificaciones[i][2];
            }
        }
        System.out.println("\nEstudiantes con la mejor nota en el Examen 3:");
        for (int i = 0; i < n; i++) {
            if (calificaciones[i][2] == mejorNota3) {
                System.out.println("Estudiante " + (i + 1));
            }
        }

        // 5. Encontrar estudiantes con la mejor nota en el Examen 1 y Examen 5
        double mejorNota1 = -1, mejorNota5 = -1;
        for (int i = 0; i < n; i++) {
            if (calificaciones[i][0] > mejorNota1) {
                mejorNota1 = calificaciones[i][0];
            }
            if (calificaciones[i][4] > mejorNota5) {
                mejorNota5 = calificaciones[i][4];
            }
        }
        System.out.println("\nEstudiantes con la mejor nota en el Examen 1:");
        for (int i = 0; i < n; i++) {
            if (calificaciones[i][0] == mejorNota1) {
                System.out.println("Estudiante " + (i + 1));
            }
        }

        System.out.println("\nEstudiantes con la mejor nota en el Examen 5:");
        for (int i = 0; i < n; i++) {
            if (calificaciones[i][4] == mejorNota5) {
                System.out.println("Estudiante " + (i + 1));
            }
        }

        // 6. Determinar qué examen tuvo el promedio más alto
        double[] promediosExamenes = new double[5];
        for (int j = 0; j < 5; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            promediosExamenes[j] = suma / n;
        }

        int mejorExamen = 0;
        for (int j = 1; j < 5; j++) {
            if (promediosExamenes[j] > promediosExamenes[mejorExamen]) {
                mejorExamen = j;
            }
        }
        System.out.println("\nEl examen con el promedio más alto fue el Examen " + (mejorExamen + 1));

        scanner.close();
    }
}
