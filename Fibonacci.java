class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 1; i <= n-2; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}