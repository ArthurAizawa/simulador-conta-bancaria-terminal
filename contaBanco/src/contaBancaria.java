
import java.util.Locale;
import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Insira o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Insira o número da agencia: ");
        int numeroAgencia = scanner.nextInt();
        System.out.print("Insira o nome de usuario: ");
        String nomeUsuario = scanner.next();
        Double saldo = 987.65;

        System.out.print("Obrigado pela preferencia pelo Banco Do Cleiton!");
        System.out.println("Agencia: "+numeroAgencia);
        System.out.println("Conta:" +numeroConta);
        System.out.println("Usuario: "+nomeUsuario);
        System.out.println("Saldo: "+saldo);
    }
}
