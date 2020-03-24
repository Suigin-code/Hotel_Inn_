package resources;

public class Reservaciones {
    private int tarifa;
    private boolean vMar;
    private boolean vGolf;
    private Habitacion habitacion;
    private Fecha entrada;
    private Fecha salida;

    private void Cotizacion() {
        this.tarifa = habitacion.getCosto();
        if (vMar) {
            this.tarifa += 350;
        } else if (vGolf) {
            this.tarifa += 200;
        }
    }

    public Reservaciones() {
        this.tarifa = 0;
        this.vMar = false;
        this.vGolf = false;
        this.habitacion = new Habitacion();
        this.entrada = new Fecha(24, 15, 0, 0);
        this.salida = new Fecha(24, 12, 0, 0);
        this.Cotizacion();
    }

    public Reservaciones(boolean vMar, boolean vGolf, boolean tIncluido, String tipo, int entrada, int salida) {
        this.tarifa = 0;
        this.vMar = vMar;
        this.vGolf = vGolf;
        this.habitacion = new Habitacion(tipo, tIncluido);
        this.entrada = new Fecha(entrada, 15, 0, 0);
        this.salida = new Fecha(salida, 12, 0, 0);
        this.Cotizacion();
    }

    public int getTarifa() {
        return tarifa;
    }

    public boolean isvMar() {
        return vMar;
    }

    public void setvMar() {
        this.vMar = !this.vMar;
        this.Cotizacion();
    }

    public boolean isvGolf() {
        return vGolf;
    }

    public void setvGolf(boolean vGolf) {
        this.vGolf = !this.vGolf;
        this.Cotizacion();
    }

    public String getHabitacion() {
        return habitacion.getTipo();
    }

    public void setHabitacion(String tipo) {
        this.habitacion.setTipo(tipo);
    }

    public Fecha getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada.setDia(entrada);
    }

    public Fecha getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida.setDia(salida);
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "Tarifa => " + tarifa +
                ", Vista al mar => " + vMar +
                ", Vista al campo de Golf => " + vGolf +
                ", Tipo de habitacion => " + habitacion.getTipo() +
                ", Costo de la habitacion => " + habitacion.getCosto() +
                ", Dia de entrada => " + entrada.getDia() +
                ", Dia de salida => " + salida.getDia() +
                '}';
    }
}
