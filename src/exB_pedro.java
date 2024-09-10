import java.util.Scanner;

public class exB_pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int valor;

        System.out.println("Digite o valor que você deseja saber a tabuada");
        valor = sc.nextInt();

        System.out.println(valor * 1 
                         + "\n" + valor * 2 
                         + "\n" + valor * 3 
                         + "\n" + valor * 4 
                         + "\n" + valor * 5 
                        + "\n" + valor * 6 
                        + "\n" + valor * 7 
                        + "\n" + valor * 8 
                        + "\n" + valor * 9 
                        + "\n" + valor * 10 + "\n");

        sc.close();
    }
}
