package builder.structure;

public class Client {

    public static void main(String[]args){

        Empresa director = new Empresa();
        ContratoAMAZON p1=new ContratoAMAZON();
        ContratoNETFLIX p2=new ContratoNETFLIX();

        director.setBuilder(p2);
        director.buildProduct();
        Product product=director.getProduct();
        product.showInfo();

        Product p3 = new Product();
        p3.setAttribute1("").setAttribute5("");
        p3.setAttribute1("").setAttribute2("").setAttribute3("");
        p3.setAttribute1("").setAttribute2("").setAttribute3("").setAttribute4("");
        p3.setAttribute1("").setAttribute2("").setAttribute3("").setAttribute4("").setAttribute5("");
    }
}

