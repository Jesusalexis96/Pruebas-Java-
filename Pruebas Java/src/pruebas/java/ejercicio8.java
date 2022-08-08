//Héctor Ramírez Gómez
//Condicionales
//Ejercicio 8
//cuenta con errores y excepciones
package pruebas.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio8 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a, b, c;

    public void ingresar() throws IOException {

        boolean exepcion = false;

        do {
            exepcion = false;
            try {
                System.out.print("Primer numero: ");
                String numeroA = br.readLine();
                a = Integer.parseInt(numeroA);
                
            } catch (Exception e) {
                System.out.println("Error, solo ingrese numeros enteros, por favor");
                exepcion = true;
            }
        } while (exepcion == true);

        do {
            exepcion = false;
            try {
                System.out.print("Segundo numero: ");
                String numeroB = br.readLine();
                b = Integer.parseInt(numeroB);
            } catch (Exception e) {
                System.out.println("Error, solo ingrese numeros enteros, por favor");
                exepcion = true;
            }
        } while (exepcion == true);

        do {
            exepcion = false;
            try {
                System.out.print("Tercer numero: ");
                String numeroC = br.readLine();
                c = Integer.parseInt(numeroC);
            } catch (Exception e) {
                System.out.println("Error, solo ingrese numeros enteros, por favor");
                exepcion = true;
            }
        } while (exepcion == true);

    }

    public void ordenar() {
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    //a, b ,c
                    System.out.println("Ordenados estarian: " + a + " " + b + " " + c);
                } else {
                    //b,c,a
                    System.out.println("Ordenados estarian: " + b + " " + c + " " + a);
                }
            } else {
                //c, a, b
                System.out.println("Ordenados estarian: " + c + " " + a + " " + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    //b, a ,c
                    System.out.println("Ordenados estarian: " + b + " " + a + " " + c);
                } else {
                    //b,c,a
                    System.out.println("Ordenados estarian: " + b + " " + c + " " + a);
                }
            } else {
                //c, b, a
                System.out.println("Ordenados estarian: " + c + " " + b + " " + a);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        ejercicio8 posibilidades = new ejercicio8();
        posibilidades.ingresar();
        posibilidades.ordenar();
    }

}
