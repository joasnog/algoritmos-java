import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) throws Exception {
        tabuada();
    }

    public static void tabuada() {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual tabuada você quer visualizar?");

        int tabuada = teclado.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
