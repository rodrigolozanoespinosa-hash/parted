import java.util.Scanner;

/**
 *
 * @author Charles y Raúl
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int num = t.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

    }

}
