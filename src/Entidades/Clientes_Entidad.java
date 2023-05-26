
package Entidades;


public class Clientes_Entidad {
    
    public String nombre, apellido, tel, ced;
    

    public Clientes_Entidad(String nombre, String apellido, String tel, String ced) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel = tel;
        this.ced = ced;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }
    
    

    
    
    
    
}

