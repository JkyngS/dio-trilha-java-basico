import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor, digite sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por Favor, digite o número da Agencia!");
        String agencia = scanner.next();

        scanner.nextLine();
        System.out.println("Por Favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por Favor, digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + " ,conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque"  );


    }
}


