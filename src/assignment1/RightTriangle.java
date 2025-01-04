/* *****************************************************************************
 *  Name:              Sheikh Md. Sazidul Islam
 *  Coursera User ID:  7e5aa5d9402827381ed9bafdbe08779c
 *  Last modified:     December 30, 2024
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = a + b + c - max - min;

        System.out.println(Math.pow(min, 2) + Math.pow(middle, 2) == Math.pow(max, 2));
    }
}
