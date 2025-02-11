import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoDeExceções {
    public static void main(String[] args){
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome + "!");
        System.out.println("Tenho " + idade + " anos!");
        System.out.println("Minha altura é " + altura + "cm!");
    }
    catch (InputMismatchException e){
        System.out.println("Os campos estão fora do forrmato aceito!");
    }
    }

}
