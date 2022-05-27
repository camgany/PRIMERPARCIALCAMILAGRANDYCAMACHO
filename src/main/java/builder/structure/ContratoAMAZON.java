package builder.structure;

public class ContratoAMAZON extends BuilderContrato {

    @Override
    public void buildCosto() {
        this.contrato.setCosto(50);
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("AMAZON");

    }

    @Override
    public void buildLista() {
        this.contrato.setLista("Mulan, El rey Leon");

    }
}
