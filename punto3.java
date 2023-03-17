package javaargprogramaClase4;


    import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Manuel
 */
public class punto3 {

    public static void main(String[] args) throws IOException {
        
        String modo = args[0];
        int desplazamiento = Integer.parseInt(args[1]);
        String archivoEntrada = args[2];
        String archivoSalida = args[3];

        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada)); // utiiza un try para abrir y cerrar los archivos
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
            
            String linea;
            while ((linea = br.readLine()) != null) { // se lee cada linea del archivo de entrada
                String resultado = "";
                for (char caracter : linea.toCharArray()) {  // Se llama al método "cifrarDescifrar" para cifrar o descifrar el carácter.
                    resultado += Character.isLetter(caracter) ? cifrarDescifrar(caracter, desplazamiento, modo.equals("codificar")) : caracter; // El resultado se almacena en la variable "resultado".
                }
                bw.write(resultado); // Se escribe el resultado en el archivo de salida 
                bw.newLine(); // se agrega una nueva linea
            }
        }
    }

    public static char cifrarDescifrar(char caracter, int desplazamiento, boolean cifrar){ // aqui toma un caracter, el n de desplazamiento y un booleano para cifrar o descifrar
        int ajuste = cifrar ? desplazamiento : -desplazamiento; // si la variable cifrar es verdadera, entonces se asigna el valor de "desplazamiento" a la variable "ajuste". De lo contrario, se asigna el valor negativo de "desplazamiento" a ajuste
        return (char) (((caracter - 'a' + ajuste + 26) % 26) + 'a');  // esta formula la tuve que googlear porque no encontraba como calcularlo
    }

}

