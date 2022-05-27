package factoryMethod.exercise;

public class CreatorElementoShorts extends Creator{

    @Override
    public IElemento factoryMethodProduct() {
        ElementoShorts elemento = new ElementoShorts();
       // elemento.setPrecio(1223);
        return elemento;
    }
}
