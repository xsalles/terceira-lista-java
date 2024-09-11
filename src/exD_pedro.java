public class exD_pedro {
    public static void main(String[] args) {
        int somaPares = 0;
        
        for(int i = 1; i <= 500; i++){
          if (i % 2 == 0){
            somaPares += i;
          }

          System.out.println("O resultado da soma de todos os pares é " + somaPares);
        } 
    }
}
