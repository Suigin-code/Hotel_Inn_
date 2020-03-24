package resources;

public class Habitacion {
    private int costo;
    private boolean tIncluido;
    private String tipo;

    private void Precio() {
        switch (this.tipo) {
            case "Sencilla" :
                if (this.tIncluido) {
                    this.costo = 2200;
                } else {
                    this.costo = 1600;
                }
                break;
            case "Doble" :
                if (this.tIncluido) {
                    this.costo = 3650;
                } else {
                    this.costo = 2650;
                }
                break;
            case "Suite" :
                if (this.tIncluido) {
                    this.costo = 5950;
                } else {
                    this.costo = 4890;
                }
                break;
            case "King" :
                if (this.tIncluido) {
                    this.costo = 7850;
                } else {
                    this.costo = 6250;
                }
                break;
            case "Presidencial" :
                if (this.tIncluido) {
                    this.costo = 9950;
                } else {
                    this.costo = 8100;
                }
                break;
        }
    }

    public Habitacion() {
        this.tipo = "Sencilla";
        this.tIncluido = false;
        this.Precio();
    }

    public Habitacion(String tipo, boolean tIncluido) {
        this.tipo = tipo;
        this.tIncluido = tIncluido;
        this.Precio();
    }

    public int getCosto() {
        return costo;
    }

    public boolean isIncluido() {
        return tIncluido;
    }

    public void setIncluido() {
        this.tIncluido = !this.tIncluido;
        this.Precio();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        this.Precio();
    }
}
