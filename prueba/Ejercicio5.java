import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws InterruptedException {
        //Escribir un programa Java que visualice un cuadrado hueco de asteriscos tamaño que introduzca el usuario, como en la imagen:
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el tamaño de un lado del cuadrado: ");
        int num = sc.nextInt();


        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= num ; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                Thread.sleep(500); // para ver como se dibujan poco a poco
            }
            System.out.println();
        }
    }
}
