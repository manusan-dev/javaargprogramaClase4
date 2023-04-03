
package javaargprogramaClase4;

import java.util.Arrays;
import java.util.Scanner;

public class punto1B {
    
    public static void main(String[] args)  {
        
        
    Scanner scanner = new Scanner(System.in);
    int[] nums = new int[3];

    for (int i = 0; i < 3; i++) {
        System.out.print("Ingrese el número " + (i + 1) + ": "); // en este caso (i+1) para que no diga 'ingrese numero 0'
        nums[i] = scanner.nextInt();
    }
    
    System.out.print("Ingrese 'a' para ascendente o 'd' para descendente: ");
    char order = scanner.next().charAt(0);
    
    if (order == 'a') {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    } else if (order == 'd') {
        Arrays.sort(nums);
        int[] descendente = new int[3];
        for (int i = 0; i < nums.length; i++) {
            descendente[i] = nums[nums.length - i - 1];
        }
        System.out.println(Arrays.toString(descendente));
    }

}
}
