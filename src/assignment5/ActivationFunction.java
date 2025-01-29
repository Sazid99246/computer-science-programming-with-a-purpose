package assignment5;

public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        double result;
        if (x < 0) {
            result = 0.0;
        } else if (x == 0) {
            result = 0.5;
        } else {
            result = 1.0;
        }

        return result;
    };

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    };

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        double expPos = Math.exp(x);
        double expNeg = Math.exp(-x);

        return (expPos - expNeg) / (expPos + expNeg);
    };

    // Returns the softsign function of x.
    public static double softsign(double x) {
        return x / (1 + Math.abs(x));
    };

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        double result;
        if (x <= -2) {
            result = -1;
        } else if (x > -2 && x < 0) {
            result = x + (Math.pow(x, 2) / 4);
        } else if (x >= 0 && x < 2) {
            result = x - (Math.pow(x, 2) / 4);
        } else {
            result = 1;
        }
        return result;
    };

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + n + ") = " + heaviside(n));
        StdOut.println("  sigmoid(" + n + ") = " + sigmoid(n));
        StdOut.println("     tanh(" + n + ") = " + tanh(n));
        StdOut.println(" softsign(" + n + ") = " + softsign(n));
        StdOut.println("     sqnl(" + n + ") = " + sqnl(n));
    };
}
