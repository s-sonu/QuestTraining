import java.util.Scanner;
class fibonacci {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
