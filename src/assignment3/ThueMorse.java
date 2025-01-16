package assignment3;

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] thueMorse = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                count += temp & 1;
                temp >>= 1;
            }
            thueMorse[i] = count % 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thueMorse[i] == thueMorse[j]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
