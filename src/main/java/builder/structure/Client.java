package builder.structure;

public class Client {

    public static void main(String[]args){

        Empresa axs = new Empresa();
        BuilderContrato amazon = new ContratoAMAZON();
        BuilderContrato hbo = new ContratoHBO();
        BuilderContrato netflix = new ContratoNETFLIX();

        Usuario mario = new Usuario("Mario Ruiz");
        mario.subscripcion(amazon,axs);
        mario.subscripcion(netflix,axs);
        mario.subscripcion(hbo,axs);
    }
}

