import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();
        scanner.nextLine();

        System.out.println("Agora insira o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por último, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta nº " + numeroConta + " e o seu saldo de R$ " + saldo + " já está disponível para ser utilizado!");
    
    }
}