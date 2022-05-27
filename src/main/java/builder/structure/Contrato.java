package builder.structure;

public class Contrato {
    public int costo;
    public String empresa;
    public String lista;

    public Contrato(){}

    public int getCosto() {
        return costo;
    }

    public Contrato setCosto(int costo) {
        this.costo = costo;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Contrato setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String getLista() {
        return lista;
    }

    public Contrato setLista(String lista) {
        this.lista = lista;
        return this;
    }

    public void showInfo() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Costo: "+this.getCosto()+"Bs");
        System.out.println("Empresa:"+this.getEmpresa());
        System.out.println("Lista de Canales:"+this.getLista());
    }
}
