/******************************************************************************
 *  Name:              Sheikh Md. Sazidul Islam
 *  Coursera User ID:  7e5aa5d9402827381ed9bafdbe08779c
 *  Last modified:     December 30, 2024
 *****************************************************************************/

public class CMYKtoRGB {
    public static void main(String[] args) {
        // Parse command-line arguments
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        // Calculate intermediate white value
        double white = 1 - black;

        // Compute RGB values and round them to the nearest integer
        int red = (int) Math.round(255 * white * (1 - cyan));
        int green = (int) Math.round(255 * white * (1 - magenta));
        int blue = (int) Math.round(255 * white * (1 - yellow));

        // Print RGB values
        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}
