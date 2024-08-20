public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Por Favor, digite sua conta: ");

        int numero = Integer.valueOf(args[0]);

        System.out.println("Por Favor, digite o número da Agencia!");

        String agencia = args[1];

        System.out.println("Por Favor, digite seu nome: ");
        

        String nome = args[2];

        System.out.println("Por Favor, digite seu saldo");

        double saldo = Double.valueOf(args[3]);

        
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + " ,conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque"  );


    }
}


