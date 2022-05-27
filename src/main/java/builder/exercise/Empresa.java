package builder.exercise;

public class Empresa {
    private BuilderContrato builder;

    public Contrato getProduct() {
        return builder.getProduct();
    }

    public void setBuilder(BuilderContrato builder) {
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createContrato();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildLista();
    }
}
