public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona(String dni, String nombre,   String apellido, String email, String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getDni() {
        return dni;
    }
    public String getEmail() {
        return email;
    }
    public String getNombre() {
        return nombre;
    }
}
