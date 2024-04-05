public class Cilindro extends Circulo{
    private double altura;
    
    public Cilindro(double altura, double radio, String color){
        super(radio, color);
        this.altura = altura;
    }

    public double calcularVolumen(){
        double volumen = altura * super.calcularArea();
        return volumen;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public void mostrar(){
        System.out.println("Radio: " + getRadio() + " Volumen: " + calcularVolumen() +  " Altura: " + getAltura()+ " Color: " + getColor() + " Area:" + super.calcularArea());
    }

    @Override
    public double calcularArea(){
        double area = (2 * Math.PI * super.getRadio() * altura) + (2 * Math.pow(super.getRadio(), 2));
        return area;
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() + " altura= " + altura;
    }
}
