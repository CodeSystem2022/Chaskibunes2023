package domain;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", departamento: "+this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}

