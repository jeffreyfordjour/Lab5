/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */

public class NewClass3 {
    public static void main(String[] args) throws Exception {
        double[] scores = {90, 100, 86};
        TestScores ts = new TestScores(scores);
        ts.getAverage();
    }
         
}

class TestScores {
    private double[] scores;
    TestScores(double[] scores) {
        this.scores = scores;
    }
    
    public double getAverage() throws Exception {
        double total = 0;
        for(int i = 0; i < this.scores.length; i++) {
            if(this.scores[i] > 100 || this.scores[i] < 0) {
                throw new Exception("Invalid Test Score");
            }
           total = total + this.scores[i];
        }
        return total/this.scores.length;
    }
}
