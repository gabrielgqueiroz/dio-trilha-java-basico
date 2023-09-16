import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;
        String buff;
        Scanner scan = new Scanner(System.in);

        do{
        System.out.println("Por favor, digite o número da Conta:");
        buff = scan.nextLine();
        } while(!buff.matches("[0-9]+") || buff.length() > 4);
        numero = Integer.parseInt(buff);

        do {
            System.out.println("Por favor, digite o número da Agência:");
            buff = scan.nextLine(); 
        } while (!buff.matches("[0-9]{3}-[0-9]"));
        agencia = buff;

        do{
            System.out.println("Por favor, digite o nome do dono da Conta:");
            buff = scan.nextLine();
        }while(!buff.matches("^[a-zA-Z ]*$"));
        nomeCliente = buff;

        do{
            System.out.println("Por favor, digite o saldo da Conta:");
            buff = scan.nextLine();
        } while(!buff.matches("^\\d*\\,?\\d{0,2}$"));
        saldo = Double.parseDouble(buff);
        scan.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
