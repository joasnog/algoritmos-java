public class LetraMaiuscula {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        letraMaiuscula("joass");
    }

    public static void letraMaiuscula(String nome) {

        String nomeTransformed = "";

        for(int i = 0; i < nome.length(); i++) {
            if(nome.length() >= 3) {
                String nomeMinusculo = nome.toLowerCase();

                int index = getCenterIndex(nome.length());
                
                char caractere = nomeMinusculo.charAt(index);

                char caractereUpper = Character.toUpperCase(caractere); 

                nomeTransformed =  nomeMinusculo.replace(caractere, caractereUpper);

            } else {
                System.out.println("Digite um nome maior ou igual a 3 digitos");
            }
        }

        System.out.println(nomeTransformed);
    }

    public static int getCenterIndex(int length) {
        return length / 2;
    }

}
