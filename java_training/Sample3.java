import java.util.Scanner;

class Sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int product= 1;

        for (int i = 1; i <= n; i++) {
                product = product *i;           
 
        }

        System.out.println("product = " + product);
    }
}