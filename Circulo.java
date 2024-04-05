public class Circulo {
    private double radio;
    private String color;

    public Circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }
    
    public double calcularArea(){
        double area = Math.PI * (Math.pow(radio, 2));
        return area;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String toString(){
        return "Circulo: Radio: " + radio + " Color: " + color;
    }
}
