package factoryMethod.exercise;

public class CreatorElementoMedias extends Creator{

    @Override
    public IElemento factoryMethodProduct() {
        ElementoMedidas elemento = new ElementoMedidas();
        //elemento.setPrecio(231);
        return elemento;
    }
}
