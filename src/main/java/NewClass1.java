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
    public static void main(String[] args) {
        int[] testd = {100,90,20,76,89};
        TestData ts = new TestData(testd);
        ts.getTotal(testd);
        ts.getAverage(testd);
        ts.getHighest(testd);
        ts.getLowestt(testd);
    }
}

class TestData {
    private int[] testdata;
    TestData(int[] testdata) {
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
