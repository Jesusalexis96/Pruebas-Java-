//Héctor Ramírez Gómez
//Mediante cliclos o bucles genera la impresion de un triangulo recto de numeros
//Ejercicio 3


//cuenta con errores y excepciones
package pruebas.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio3 {

    static void Triangulo() throws IOException {
        boolean exepcion = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            exepcion = false;
            try {
                System.out.print("Por favor ingrese el numero de filas: ");
                String rows = br.readLine();
                int filas = Integer.parseInt(rows);
                int num = 1;
                for (int x = 1; x <= filas; x++) {
                    for (int i = 1; i <= x; i++) {
                        System.out.print(num++ + "");
                    }
                    System.out.println("");
                }
                exepcion = true;
            } catch (Exception e) {
                System.out.println("Error, solo ingrese numeros enteros, por favor");
                exepcion = true;
            }
        } while (exepcion = true);

    }

    public static void main(String[] args) throws IOException {
        Triangulo();

    }

}
