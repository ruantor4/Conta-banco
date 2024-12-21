import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o numero da conta:");
        int conta = scan.nextInt();

        System.out.println("Digite a agencia:");
        String agencia = scan.next();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scan.next();

        System.out.println("Digite o saldo:");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + ", e seu saldo: " + saldo + " já está disponível para saque.");
    
     }

}
