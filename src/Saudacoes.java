import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Saudacoes {
    public static void main(String[] args) throws Exception {
        saudacoes();
    }

    public static void saudacoes() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String nome = teclado.nextLine();

        LocalDate dataAtual = LocalDate.now();
        Locale br = new Locale("pt", "BR");

        String diaDaSemana = dataAtual.getDayOfWeek().getDisplayName(TextStyle.FULL, br);
        LocalDateTime agora = LocalDateTime.now();

        String formattedHour = agora.getHour() + ":" + agora.getMinute() + "; ";

        if(agora.getHour() >= 6 && agora.getHour() < 12) {
            returnSaudacoes(nome, diaDaSemana, formattedHour, "Bom dia!");  
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            returnSaudacoes(nome, diaDaSemana, formattedHour, "Boa Tarde!");
        } else {
            returnSaudacoes(nome, diaDaSemana, formattedHour, "Boa Noite!");
        }

        // System.out.println(saudacoes);
    }

    public static void returnSaudacoes(String nome, String diaDaSemana, String formattedHour, String congrats) {
        System.out.println("Olá " + nome + " " + "hoje é " + diaDaSemana + " " + "ás: " + formattedHour  + congrats); 
    }
}
