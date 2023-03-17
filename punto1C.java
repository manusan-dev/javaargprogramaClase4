/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaargprogramaClase4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class punto1C {
    
    public static void main(String[] args) {
           
        int[] nums;
        Scanner scanner = new Scanner(System.in);
        
        if (args.length == 3) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
           
            nums = new int[] { num1, num2, num3 };
        } else {
            nums = new int[3];
                for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": "); // (i+1) para que no diga 'ingrese numero 0'
                nums[i] = scanner.nextInt();
    }   
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
