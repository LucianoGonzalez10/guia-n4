public class figura {
    String color;
    double radio;
    double alto;
    double largo;

    figura(String color, double radio, double alto, double largo){
        this.color = color;
        this.radio = radio;
        this.alto = alto;
        this.largo = largo;
    }

    public double calcularArea(){
        double area = alto * largo;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = (alto * 2.0) + (largo * 2.0);
        return perimetro;
    }
}
