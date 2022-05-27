package factoryMethod.exercise;

public class Client {
    public static void main (String []args){

        ElementoTenis e1 = (ElementoTenis) new CreatorElementoTenis().factoryMethodProduct();
        e1.setPrecio(322);
        e1.showInfo();

        ElementoShorts e2 = (ElementoShorts) new CreatorElementoShorts().factoryMethodProduct();
        e2.setPrecio(32);
        e2.showInfo();

        ElementoPelotaFutbol e3 = (ElementoPelotaFutbol) new CreatorElementoPelotaFutbol().factoryMethodProduct();
        e3.setPrecio(400);
        e3.showInfo();

        ElementoMedidas e4 = (ElementoMedidas) new CreatorElementoMedias().factoryMethodProduct();
        e4.setPrecio(12);
        e4.showInfo();

        ElementoCamiseta e5 = (ElementoCamiseta) new CreatorElementoCamiseta().factoryMethodProduct();
        e5.setPrecio(55);
        e5.showInfo();


    }
}
