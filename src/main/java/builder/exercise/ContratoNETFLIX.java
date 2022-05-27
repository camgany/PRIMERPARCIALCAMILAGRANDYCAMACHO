package builder.exercise;

public class ContratoNETFLIX extends BuilderContrato {


    @Override
    public void buildCosto() {
        this.contrato.setCosto(150);
    }

    @Override
    public void buildEmpresa() {
        this.contrato.setEmpresa("NETFLIX");

    }

    @Override
    public void buildLista() {
        this.contrato.setLista("How I met you mother, grow up");

    }
}
