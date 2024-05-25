public class Empleado {
    private String nombre;
    private String apellido;
    private int numID;

    public Empleado(String nombre, String apellido, int numID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numID = numID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }
}
