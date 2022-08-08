//Héctor Ramírez Gómez
//Escribe el suguiente codigo que solvente
//Ejercicio 7


package pruebas.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class ejercicio7 {

    //variables para numero random
    int NumeroR = ThreadLocalRandom.current().nextInt(1, 100);
    //variables de usuario al intentar
    int intento = 0;
    //variables para intento 5 
    int numeroInt = 0;

    public void Juego() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Adivina el numero del 1 - 100 !");
        
        
        do {
            numeroInt++;
            System.out.print("pienso que es el: ");
            String intentar = br.readLine();
            intento = Integer.parseInt(intentar);

            if (NumeroR > intento) {
                System.out.println("El numero pensado es mayor");
            }
            if (NumeroR < intento) {
                System.out.println("El numero pensado es menor");
            }
        } while (numeroInt != 5 && NumeroR != intento);

    }

    public void Resultado() {
        if (NumeroR == intento) {
            System.out.println("\nGANASTE");
            System.out.println("El numero correcto era: " + NumeroR);
            numeroInt--;
        }
        if (numeroInt == 5) {
            System.out.println("\nPERDISTE, EXEDISTE EL LIMITE DE INTENTOS");
            System.out.println("El numero correcto era: " + NumeroR);
        }
    }

    public static void main(String[] args) throws IOException {
        ejercicio7 juego = new ejercicio7();
        juego.Juego();
        juego.Resultado();
    }

}
