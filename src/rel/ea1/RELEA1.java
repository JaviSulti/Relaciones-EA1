
package rel.ea1;

import java.util.Scanner;
import rel.ea1.entidades.Perro;
import rel.ea1.entidades.Persona;
import rel.ea1.servicio.ServicioPerro;
import rel.ea1.servicio.ServicioPersona;

public class RELEA1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Bienvenida/o. Por favor, siga las instrucciones con atencion.");

        ServicioPersona sp = new ServicioPersona();
        System.out.println("---------- PRIMERA PERSONA ----------");
        Persona per1 = sp.crearPersona(1);
        System.out.println("---------- SEGUNDA PERSONA ----------");
        Persona per2 = sp.crearPersona(2);

        ServicioPerro spe = new ServicioPerro();
        System.out.println("---------- PRIMER PERRO ----------");
        Perro dog1 = spe.crearPerro(1);
        System.out.println("---------- SEGUNDO PERRO ----------");
        Perro dog2 = spe.crearPerro(2);

        if (per1 != null && per2 != null && dog1 != null && dog2 != null) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Para la persona " + per1.getApellido() + ", " + per1.getNombre() + " indique el numero del perro desea asociar: ");
            System.out.println("1. " + dog1.getNombre());
            System.out.println("2. " + dog2.getNombre());
            boolean flag = true;
            int opc = teclado.nextInt();
            do {
                switch (opc) {
                    case 1:
                        System.out.println("---------- VINCULACION DE MASCOTA ----------");
                        per1.setMascota(dog1);
                        System.out.println("La informacion correspondiente la persona 1 y la mascota 1 es: ");
                        System.out.println(per1.toString());
                        System.out.println("La informacion correspondiente la persona 2 y la mascota 2 es: ");
                        per2.setMascota(dog2);
                        System.out.println(per2.toString());
                        flag = false;
                        break;
                    case 2:
                        System.out.println("---------- VINCULACION DE MASCOTA ----------");
                        per1.setMascota(dog2);
                        System.out.println("La informacion correspondiente la persona 1 y la mascota 2 es: ");
                        System.out.println(per1.toString());
                        per2.setMascota(dog1);
                        System.out.println("La informacion correspondiente la persona 2 y la mascota 1 es: ");
                        System.out.println(per2.toString());
                        flag = false;
                        break;
                    default:
                        System.out.println("Ud. ingreso una opcion incorrecta. Intentelo nuevamente > ");
                        opc = teclado.nextInt();
                        break;
                }
            } while (flag == true);

        }

    }

}
