public class MaiorNumeroDoArray {
    public static void main(String[] args) throws Exception {

        maiorNumeroDoArray();
    }

    public static void maiorNumeroDoArray() {
        int[] numeros = {2, 4, 10, 80, 70, 200, 100, 30};
        int maiorNumero = 0;

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            } 
        }

        System.out.println("O maior número do array é o: " + maiorNumero);
    }
}
