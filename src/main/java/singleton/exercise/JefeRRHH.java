package singleton.exercise;

public class JefeRRHH {
    private System nombre;

    public System getNombre() {
        return nombre;
    }

    public void setNombre(System nombre) {
        this.nombre = nombre;
    }

    public void verInfo(TemaTesis temaTesis){
        TemaTesis.getInstance().verInf();
    }
}
