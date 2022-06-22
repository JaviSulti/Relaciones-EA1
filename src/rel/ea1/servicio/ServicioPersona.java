package rel.ea1.servicio;

import java.util.Scanner;
import rel.ea1.entidades.Persona;

public class ServicioPersona {
    
    public Persona crearPersona(int i) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Persona p = new Persona();
        System.out.print("Indique el nombre de la persona " + i + " > ");
        p.setNombre(teclado.next());
        System.out.print("Indique el apellido de " + p.getNombre() + " > ");
        p.setApellido(teclado.next());
        System.out.print("Indique la edad de " + p.getApellido() + ", " + p.getNombre() + " > ");
        p.setEdad(teclado.nextInt());
        System.out.print("Indique el documento de " + p.getApellido() + ", " + p.getNombre() + " > ");
        p.setDocumento(teclado.nextInt());
        return p;
    }
    
}
