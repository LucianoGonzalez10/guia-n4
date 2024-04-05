public class rectangulo extends figura{
    double perimetro;
    rectangulo(String color, double radio, double alto, double largo){
        super(color, radio, alto, largo);
        this.perimetro = super.calcularPerimetro();
    }
    
    public void mostrar(){
        System.out.println("Color: " + color + " Radio: " + radio + " Alto: " + alto + " Largo: " + largo + " Perimetro: " + perimetro);
    }
}
