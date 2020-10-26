/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClass1 {
    private int[] testdata;
    NewClass1(int[] testdata) {
        this.testdata = testdata;
    }
    
    public int getTotal(int[] array) {
        int total = 0;
        for(int i = 0; i < array.length; i++) {
           total = total + array[i];
        }
        return total;
    }
    
    public int getAverage(int[] array) {
        int total = getTotal(array);
        return total/array.length;
    }
    
    public int getHighest(int[] array) {
        int highest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > highest) {
            highest = array[i];
           }
        }
        return highest;
    }
    
        public int getLowestt(int[] array) {
        int lowest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < lowest) {
            lowest = array[i];
           }
        }
        return lowest;
    }
}
