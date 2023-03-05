
package alberto.git;

import java.util.Scanner;

/**
 *
 * @author Alberto López García
 */
public class AlbertoGIT {

    public static void main(String[] args) {
        
         int dato;
        int intentos = 20;
        boolean haGanado = false;

        int numero = (int) ((Math.random() * 61) + 20);

        Scanner sc = new Scanner(System.in);

        while (intentos > 0 && !haGanado) {
            do {
                System.out.println("introduce un número");
                dato = sc.nextInt();

            } while (dato < 20 || dato > 80);

            if (dato < numero) {
                System.out.println("el número es mayor");
                intentos--;
            } else if (dato > numero) {
                System.out.println("el número es menor");
                intentos--;
            } else  {

                haGanado = true;

            }

        }

        if (haGanado) {
            System.out.println("has acertado");
        } else {
            System.out.println("has perdido");
        }
    }
    
}
