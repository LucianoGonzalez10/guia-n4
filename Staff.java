public class Staff extends Persona{
    private Double salario;
    private String turno;

    public Staff(String dni, String nombre,   String apellido, String email, String direccion, Double salario, String turno){
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public Double getSalario() {
        return salario;
    }
    public String getTurno() {
        return turno;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void mostrar(){
    System.out.println(" Nombre: " + super.getNombre() + " Apellido: " + super.getApellido() + " Email: " + super.getEmail() + " Direccion: " + super.getDireccion() + " Salario: " + salario + " Turno: " + turno);
    }
}
