public class Estudiante extends Persona{
    private String ingreso;
    private Double cuota;
    private String carrera;

    public Estudiante(String dni, String nombre,   String apellido, String email, String direccion, String ingreso, Double cuota, String carrera){
        super(dni, nombre, apellido, email, direccion);
        this.ingreso = ingreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }
    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }
    public String getCarrera() {
        return carrera;
    }
    public Double getCuota() {
        return cuota;
    }
    public String getIngreso() {
        return ingreso;
    }

    public void mostrar(){
        System.out.println(" Nombre: " + super.getNombre() + " Apellido: " + super.getApellido() + " Email: " + super.getEmail() + " Direccion: " + super.getDireccion() + " Ingreso: " + ingreso + " Cuota: " + cuota + " Carrera: " + carrera);
    }
}
