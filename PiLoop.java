/* Xiao G. Wu
 * PiLoop - Class Exercise
 * 9/19/2011
 */

/** This class estimates the value of Pi using Gregory-Leibniz series */

public class PiLoop 
{
    public static void main(String[] args)
    {
        int d = 3; // Pi expansion initial denominator
        double pi = 4.0; // Initial estimate for Pi
        final int iterations = 3000000; // How man times to iterate

        for (int i = 1; i <= iterations; i++)
        {
            System.out.print("Iteration #" + i + "\t"); // Print iteration
            pi = pi + (4.0 / d)*Math.pow(-1,i); // Use Math.pow to alternate sign of the series 
            System.out.print("pi = " + pi + "\t"); // Current estimate of Pi
            System.out.printf("Diff: %f\n", Math.abs(Math.PI - pi)); // Absolute difference between estimate and Math.PI
            d += 2; // Denominator increases by 2 
        }
    }
}
