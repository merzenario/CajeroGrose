package cajero.ejemplo;
import java.util.Scanner;

public class CajeroProc {
    private double saldo = 100000; // saldo inicial
    Scanner scanner = new Scanner(System.in);
    private int intentos = 1;

    public void ConsultarChichigua() {
        System.out.println("Ay mari*** que miseria 🤣 : " + saldo);
    }

    public void Retiro(){
        System.out.println("Cuanto quiere?: ");
        double retiro = scanner.nextDouble();
        if (retiro > 0 && retiro <= saldo) {
            saldo -= retiro;
            System.out.println("Que chimb** 👍, lo que queda es: "+saldo);
        } else {
            System.out.println("Despertate pues!! 🤨 apenas tenes: "+saldo);
        }
    }

    public void Depositar(){
        System.out.println("Cuanto depositas? : ");
        double deposito = scanner.nextDouble();
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Eso!! 👌 ya no estamos tirados, el saldo es: " + saldo);
        } 
    }

    public void Transferir(){
        System.out.println("Numero de cuenta pues: ");
        int cuenta = scanner.nextInt();  
        System.out.println("Cuanto va a mandar: ");
        double transfer = scanner.nextDouble(); 
        if (transfer > 0 && transfer <= saldo) {
            saldo -= transfer;
            System.out.println("Que chimb** 👍, lo que queda es: "+saldo);
        } else {
            System.out.println("Despertate pues!! 🤨 apenas tenes: "+saldo);
        }    
    } 
}
