import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, eu me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho  " + idade + " anos de idade!");
        System.out.println("Minha altura é  " + altura + "cm !");

    }

    
}
