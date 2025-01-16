package assignment3;

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 1; i < a.length + 1; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
        }

        int[] s = new int[a.length];
        int comSum = 0;
        for (int i = 0; i < a.length; i++) {
            comSum += a[i];
            s[i] = comSum;
        }

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * comSum); // Random number between 0 and comSum - 1
            for (int j = 0; j < s.length; j++) {
                if (r < s[j]) {
                    System.out.print((j + 1) + " "); // Print the index (j + 1 because array is 0-based)
                    break;
                }
            }
        }
    }
}
