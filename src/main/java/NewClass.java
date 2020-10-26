/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClass { 
    public void getNumbers(int[] array, int number) {
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > number) {
                System.out.println(array[i]);
            }
        }
               
    }
}
