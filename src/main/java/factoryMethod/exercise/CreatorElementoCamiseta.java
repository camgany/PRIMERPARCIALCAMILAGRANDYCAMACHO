package factoryMethod.exercise;

public class CreatorElementoCamiseta extends Creator{

    @Override
    public IElemento factoryMethodProduct() {
        ElementoCamiseta elemento = new ElementoCamiseta();
        //elemento.setPrecio(92);
        return elemento;
    }
}
