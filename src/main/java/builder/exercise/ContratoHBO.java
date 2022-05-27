package builder.exercise;

public class ContratoHBO extends BuilderContrato{
    @Override
    public void buildCosto() {
        this.contrato.setCosto(50);
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("HBO");

    }

    @Override
    public void buildLista() {
        this.contrato.setLista("Grow Up, La la land");

    }
}
