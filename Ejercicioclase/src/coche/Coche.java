package coche;

public class Coche {
    //1.Defino sus características
    int ruedas;
    int largo;
    int ancho;
    int motor;//lo pongo en cc
    int peso;

/*2. Creo un método constructor
Es un método especial que se encarga de dar
estado inicial al objeto
Para construir un método constructor, debemos usar el
MISMO NOMBRE que la clase*/
public String dime_motor(){
    return "El motor del coche tiene " + motor + "caballos de potencia";
    }
    public Coche() {
        //Empezamos a construir el estado inicial del coche
        ancho=250;
        largo=400;
        ruedas=4;
        motor=200;
        peso=1900;

    }

}