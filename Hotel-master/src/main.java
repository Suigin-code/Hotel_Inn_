import resources.Reservaciones;

public class main {
    public static void main(String[] args) {
        Reservaciones reservacion1 = new Reservaciones();
        Reservaciones reservacion2 = new Reservaciones(true, false, true, "Presidencial", 18, 24);

        System.out.println(reservacion1.toString());
        System.out.println(reservacion2.toString());
    }
}
