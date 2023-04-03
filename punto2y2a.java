
package javaargprogramaClase4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class punto2y2a {
    public static void main(String[] args) throws IOException {

        String rutaArchivo = "C:\\Users\\Manuel\\Documents\\NetBeansProjects\\JavaArgPrograma\\src\\javaargprogramaClase4\\numeros.txt";  
        String elegirOperacion = "suma"; // para decidir que tipo de operacion realizar(punto 2-A)
        int contador = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;
            while ((linea = lector.readLine()) != null) { // lee el archivo linea x linea
                if (linea.matches("\\d+")) { //  Si la linea contiene un numero, se pasa a entero y se realiza la operacion deseada
                    int numero = Integer.parseInt(linea);
                    if (elegirOperacion.equals("suma")) {
                        contador = contador + numero;
                    } else if (elegirOperacion.equals("multiplicacion")) {
                        contador = contador * numero;
                    }
                }
            }

            System.out.println("La suma de los números es: " + contador);

        }
    }
}