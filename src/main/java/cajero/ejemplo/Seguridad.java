package cajero.ejemplo;
import java.util.Scanner;

public class Seguridad {

        final int PIN_CORRECTO = 1234;
        double saldo = 100000;
        int intentos = 1;
        boolean cuentaBloqueada = false;

        Scanner scanner = new Scanner(System.in);

    public void Ingreso(){
        while(intentos <= 3){
            System.out.println("ingrese su PIN: ");
            System.out.println("-------------------------");
            int pinIngresado = scanner.nextInt();

            if(pinIngresado == PIN_CORRECTO){
                System.out.println("------------------------");
                System.out.println("!!Welcome Gonorr***¡¡");
                break;
            }else{
                System.out.println("!!PIN incorrecto¡¡" +intentos);
                System.out.println("Recuerda!! solo hay 3 intentos");
                intentos++;
            if(intentos == 3);{
                cuentaBloqueada = true;
                System.out.println("!!Cuenta Bloqueado¡¡");
            }
        }
        }
        if(cuentaBloqueada){
            scanner.close();
            return;
        }

    }

    public void CambiarClave(){
        System.out.println("Ingrese su clave pues: ");
        int pinOld = scanner.nextInt();

        if(pinOld == 1234){
            System.out.println("Cambie la clave pues: ");
            int pinNew = scanner.nextInt();
            System.out.println("Otra vez, pa que no se el olvide: ");
            int pinEnd = scanner.nextInt();
            if(pinEnd == pinNew){
                System.out.println("!!Listo el pollo¡¡ 😎😎😎");
            }else{
            System.out.println("!!PIN incorrecto¡¡🤨🤨" + intentos);
            intentos++;
            if(intentos <= 3){
                cuentaBloqueada = true;
                System.out.println("!!Cuenta Bloqueado¡¡");
            }
            }return;
        
    }

    }

}
