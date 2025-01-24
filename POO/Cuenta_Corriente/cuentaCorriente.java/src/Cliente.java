public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private Raza raza;

    public Cliente(String nombre, String apellidos, String dni, Raza raza) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

}
