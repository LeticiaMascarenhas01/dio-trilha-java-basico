import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner banco = new Scanner(System.in)) {
            System.out.println("Digite o seu nome e sobrenome: ");
            String nome = banco.nextLine();

            System.out.println("Por favor, digite o número da Agência !");
            int agencia = banco.nextInt();

            System.out.println("Por favor, digite seu saldo: ");
            double saldo = banco.nextDouble();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + saldo + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}
