package domain;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamente){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribimos el método
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Departamento: "+this.departamento;
    }
}
