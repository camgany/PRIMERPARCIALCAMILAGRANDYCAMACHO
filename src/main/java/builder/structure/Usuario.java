package builder.structure;

public class Usuario {
    private String nombre;
    public Usuario(String nombre){
        this.nombre=nombre;
    }
    public void subscripcion(BuilderContrato builderContrato, Empresa empresa){
        empresa.setBuilder(builderContrato);
        empresa.getProduct();

        Contrato contrato = empresa.getProduct();
        contrato.showInfo();


    }
}
