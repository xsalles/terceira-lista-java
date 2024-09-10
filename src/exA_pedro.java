import java.util.Arrays;

public class exA_pedro{
    public static void main(String[] args) {
        int valorDasRaizes = 0;

        for (int i = 15; i <= 200; i++){
            valorDasRaizes = i*i;
            System.out.println(valorDasRaizes);
        }

        int[] raizesQuadradas = new int[]{valorDasRaizes};

        Arrays.sort(raizesQuadradas);

        System.out.println(Arrays.toString(raizesQuadradas));
    }
}
