
package Dominio;

public class Cuaderno {
    private int numCuaderno;
    private String descripcion;

    public Cuaderno() {
    }

    public Cuaderno(int numCuaderno, String descripcion) {
        this.numCuaderno = numCuaderno;
        this.descripcion = descripcion;
    }

    public int getNumCuaderno() {
        return numCuaderno;
    }

    public void setNumCuaderno(int numCuaderno) {
        this.numCuaderno = numCuaderno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Numero de cuaderno: " + numCuaderno + "\nDescripcion: " + descripcion;
    }

}
