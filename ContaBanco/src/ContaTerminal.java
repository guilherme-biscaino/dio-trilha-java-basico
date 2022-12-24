import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o seu Nome");
        String nomeCliente = scanner.next();


        System.out.println("Agora, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite a agencia da conta");
        String agencia = scanner.next();

        System.out.println("E por fim, digite o saldo de sua conta");
        Double saldo = scanner.nextDouble();

        scanner.close();
        imprimirDados(numero, agencia, nomeCliente, saldo);

    }
    public static void imprimirDados(int Numero, String Agencia, String NomeCliente, Double Saldo){

    	 System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
        
    }

