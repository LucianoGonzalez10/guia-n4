public class Circulo3 extends figura{
    double area;
    Circulo3(String color, double radio, double alto, double largo){
        super(color, radio, alto, largo);
        area = super.calcularArea();   
    }
    public void mostrar(){
        System.out.println("Color: " + color + " Radio: " + radio + " Alto: " + alto + " Largo: " + largo + " Area: " + area);
    }
}
