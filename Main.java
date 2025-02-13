import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 11: ");
        int item = sc.nextInt();

        if (item == 1) {
            System.out.print("Ingrese la dimensión de la matriz: ");
            int d = sc.nextInt();

            if (d > 0) {
                Punto1 punto1 = new Punto1();
                punto1.p1(d);
            } else {
                System.out.println("Dimensión inválida, debe ser mayor que 0.");
            }
        } else if (item == 2) {
            System.out.print("Ingrese la dimensión de la matriz: ");
            int d = sc.nextInt();
            if (d > 0) {
                Punto2 punto2 = new Punto2();
                punto2.p2(d);
            } else {
                System.out.println("Dimensión inválida, debe ser mayor que 0.");
            }
        }else if (item == 3) {
            System.out.print("Ingrese la dimensión de la matriz: ");
            int d = sc.nextInt();
            if (d > 0) {
                Punto3 punto3 = new Punto3();
                punto3.p3(d);
            } else {
                System.out.println("Dimensión inválida, debe ser mayor que 0.");
            }
        }else if (item == 4) {
            System.out.print("Ingrese la dimensión de la matriz: ");
            int d = sc.nextInt();
            if (d > 0) {
                Punto4 punto4 = new Punto4();
                punto4.p4(d);
            } else {
                System.out.println("Dimensión inválida, debe ser mayor que 0.");
            }
        } else {
            System.out.println("Opción incorrecta.");
        }

        sc.close();
    }
}
