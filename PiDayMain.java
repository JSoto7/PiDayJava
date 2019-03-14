// Java students at Wyomissing Area HS compute Pi on Pi Day 2018
// https://codeboard.io/projects/77478
// PI is about 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + 1/2n-1 - 1/2n+1)

public class PiDayMain 
{
    public static void main(String[] args) 
    {
        int numIterations = 5000;       // # of terms from the series to use to approximate PI
        double result = 0.0;            // approximation of PI
        boolean positive = true;        // changing between pos & neg terms in the series
    
        for (int i = 0; i < numIterations; i++) 
        { 
            double nextTerm = 1. / (2 * i + 1); // compute next term in the series
            
            if (positive) 
            {
                result += nextTerm; 
            }
            else 
            {
                result -= nextTerm; 
            }
            
            positive = !positive;       // terms in series alternate between pos & neg
        }
        
        result *= 4;                    // formula approximate 1/4th of PI
        
        System.out.println("Pi is approximately " + result);
    } // end of main method
    
}// end of Main class
