
package Entidades;

public class Vehiculo_Entidad {
    
    public String modelo, placa, tipo;

    public Vehiculo_Entidad(String modelo, String placa, String tipo) {
        this.modelo = modelo;
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    
}
