package Herencia;

public class Automovil extends Vehiculo {


    private String tipoDeCombustible;
    public Automovil(String marca, String modelo, int anno, String tipoDeCombustible) {
        super(marca, modelo, anno);
        this.tipoDeCombustible = tipoDeCombustible;


    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }


}
