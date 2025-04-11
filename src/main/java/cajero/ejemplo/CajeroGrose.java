package cajero.ejemplo;
import java.util.Scanner;

public class CajeroGrose {
    private static Scanner scanner = new Scanner(System.in);
    private static CajeroProc CajeroProc = new CajeroProc();
    private static Seguridad seguridad = new Seguridad();
    public static void main(String[] args) {

        seguridad.Ingreso();
        //menu
        int opcion;
        do { 
            System.out.println("------------------------");
            System.out.println("\n Bienvenido al cajero gono****");
            System.out.println("------------------------");
            System.out.println("Que se le ofrece: ");
            System.out.println("-------------------------");
            System.out.println("1. Consultar Chichigua");
            System.out.println("2. Retirar los pesos");
            System.out.println("3. Depositar");
            System.out.println("4. Transferir");
            System.out.println("5. Cambio de clave");
            System.out.println("6. Open the parch");
            System.out.println("-------------------------");
            opcion = scanner.nextInt();
            ///opciones
            switch(opcion){
                case 1:
                    CajeroProc.ConsultarChichigua();
                    break;
                case 2:
                    CajeroProc.Retiro();
                    break;
                    
                case 3:
                    CajeroProc.Depositar();
                    break;
                    
                case 4:      
                    CajeroProc.Transferir();
                    break;
                case 5:
                    seguridad.CambiarClave();
                    seguridad.Ingreso();
                    break;
                case 6:     
                    System.out.println("Nos pillamos!!");
                default:
                    System.out.println("Avispate pues!! eso no es una opcion!!");
            }
        } while (opcion!= 6);
        scanner.close();
        System.out.println("Gracias por usar el cajero gono****");
        
       }
}