
package javaargprogramaClase4;

import java.util.Arrays;


public class punto1{

  
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Debes ingresar 3 números y un orden 'a' o 'd'");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        char order = args[3].charAt(0);

        int[] nums = { num1, num2, num3 };

       if (order == 'a') {
            Arrays.sort(nums);
             System.out.println(Arrays.toString(nums));
}      else if (order == 'd') {
            Arrays.sort(nums);
       int[] descendente = new int[3];
       for (int i = 0; i < nums.length; i++) {
            descendente[i] = nums[nums.length - i - 1];
    }
            System.out.println(Arrays.toString(descendente));
}
    }
}

// primer ejercicio 