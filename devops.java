class devops {

    static double product(int n) {
        double i, p = 1;
        for (i = 1; i <= n; i++)
            p = p * 1 / i;
        return p;
    }

    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        System.out.printf("Product of the series is %f", product(n));

    }
}