public class Main {

    public static void main(String[] args) {
	// write your code here

        int n = 1;
        int output;

        // squares
        System.out.print("First 10 Square Numbers: ");
        while (n<=10) {
            output = n * n;
            n = n + 1;
            System.out.print(output + " ");
        }

        // cubes
        System.out.print("\nFirst 10 Cube Numbers: ");
        n=1;
        while (n<=10) {
            output = n * n * n;
            n = n + 1;
            System.out.print(output + " ");
        }

        // fibonacci
        System.out.print("\nFirst 10 Fibonacci Numbers: ");
        n=1;
        output = 0;
        int output1 = 1;
        while (n<=5) {
            output = output + output1;
            System.out.print(output + " ");
            output1 = output1 + output;
            n = n + 1;
            System.out.print(output1 + " ");
        }

        // prime
        System.out.print("\nFirst 10 Prime numbers: ");
        int dividors = 0;
        output = 1;
        while (output<30) {
            int test = 1;
            while (test<30) {
                if (output % test == 0) {
                    dividors = dividors + 1;
                    test = test + 1;
                } else
                    test = test + 1;
            }
            if (dividors ==2)
                System.out.print(output + " ");
            dividors = 0;
            output = output + 1;
        }

        // Triangle
        System.out.print("\nFirst 10 Triangle Numbers: ");
        n=1;
        while (n<=10) {
            output = ((n)*(n + 1)) / 2;
            n = n + 1;
            System.out.print(output + " ");
        }
    }
}
