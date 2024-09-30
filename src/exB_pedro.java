import java.util.Scanner;

public class exB_pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int value;

        System.out.println("\nDigite o valor que você deseja saber a tabuada\n");
        value = sc.nextInt();
        
        System.out.printf("\nTABUADA DO %d\n\n", value);

        for (int i = 1; i <= 10; i++) {
            System.out.println(value * i);
        }

        sc.close();
    }
}
