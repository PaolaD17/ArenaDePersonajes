import Personajes.Arquero;
import Personajes.Guerrero;
import Personajes.Mago;
import Personajes.Personaje;

public class Main {
    public static void main(String[] args) {
        Personaje g = new Guerrero("Thor", 100, 5, 40);
        Personaje m = new Mago("Merlín", 80, 4, 35, 90);
        Personaje a = new Arquero("Legolas", 90, 6, 45);

        System.out.println(g.resumen());
        System.out.println(m.resumen());
        System.out.println(a.resumen());

        g.recibirDaño(30);
        m.curar(15);
        a.recibirDaño(100);

        System.out.println("\nDespués del combate:");
        System.out.println(g);
        System.out.println(m);
        System.out.println(a);
    }

    holaaa probando
}
