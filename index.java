public class index {
    public static void main(String[] args) {
        // EJERCICIO 1
        /* 
        Cilindro cilindro = new Cilindro(6.0, 5.0, "azul");
        cilindro.mostrar();
        System.out.println(cilindro.toString()); */

        // EJERCICIO 2
        /* Estudiante estudiante1 = new Estudiante("45239334", "Luciano", "Marangoni", "lucho@gmail.com" , "Salta 2788", " 27/11/2011", 79000.99, "Programacion");
        Estudiante estudiante2 = new Estudiante("56781234", "Lupo", "Damian", "dami@gmail.com" , "Jujuy 2788", " 31/12/2013", 39499.99, "Ambiente");
        Estudiante estudiante3 = new Estudiante("23405924", "Matteo", "Daniele", "mate@gmail.com" , "Espania 2788", " 12/8/2015", 23899.99, "Manicura");
        Estudiante estudiante4 = new Estudiante("34567987", "Lauti", "Rivadavia", "lau@gmail.com" , "20 de Septiembre 2788", " 1/1/2000", 45600.99, "Profesorado");
        estudiante1.mostrar();
        estudiante2.mostrar();
        estudiante3.mostrar();
        estudiante4.mostrar();
        Staff staff1 = new Staff("45239334", "Tomas", "Marangoni", "lucho@gmail.com" , "Salta 2788", 22245.55, "Noche");
        Staff staff2 = new Staff("45239334", "Mariano", "Marangoni", "lucho@gmail.com" , "Salta 2788", 22245.55, "Noche");
        Staff staff3 = new Staff("45239334", "Hernan", "Marangoni", "lucho@gmail.com" , "Salta 2788", 22245.55, "Maniana");
        Staff staff4 = new Staff("45239334", "Jose", "Marangoni", "lucho@gmail.com" , "Salta 2788", 22245.55, "Maniana");
        staff1.mostrar();
        staff2.mostrar();
        staff3.mostrar();
        staff4.mostrar();
        Persona arregloPersonas[];
        arregloPersonas = new Persona[8];
        arregloPersonas[0] = estudiante1;
        arregloPersonas[1] = estudiante2;
        arregloPersonas[2] = estudiante3;
        arregloPersonas[3] = estudiante4;
        arregloPersonas[4] = staff1;
        arregloPersonas[5] = staff2;
        arregloPersonas[6] = staff3;
        arregloPersonas[7] = staff4;
        int estudiantesCant = 0;
        int staffCant = 0;
        Double ingresoTotal = 0.0;
        for(int i = 0; i<8;i++){
            if(arregloPersonas[i] instanceof Estudiante){
                estudiantesCant++;
                Estudiante auxiliar = (Estudiante) arregloPersonas[i];
                ingresoTotal = ingresoTotal + auxiliar.getCuota();
            }
            else{
                staffCant++;
            }
        }
        System.out.println(staffCant);
        System.out.println(estudiantesCant);
        System.out.println(ingresoTotal); */
        // EJERCICIO 3
        Circulo3 circulito1 = new Circulo3("rojo", 5.0, 6.5 , 3.0);
        circulito1.mostrar();

        rectangulo rectangulito = new rectangulo("verde", 5.0, 3.0, 6.0);
        rectangulito.mostrar();

    }
}