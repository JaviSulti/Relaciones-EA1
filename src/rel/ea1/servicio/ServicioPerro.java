package rel.ea1.servicio;

import java.util.Scanner;
import rel.ea1.entidades.Perro;

public class ServicioPerro {
    
    public Perro crearPerro(int i){
        Perro p = new Perro();
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Indique el nombre del perro " + i + " > ");
        p.setNombre(teclado.next());
        System.out.print("Indique la raza de " + p.getNombre() + " > ");
        p.setRaza(teclado.next());
        System.out.print("Indique la edad de " + p.getNombre() + " > ");
        p.setEdad(teclado.nextInt());
        System.out.print("Indique el tamanio (chico, mediano, grande) de " + p.getNombre() + " > ");
        p.setTamanio(teclado.next());
        return p;
    }
    
}
