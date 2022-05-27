package factoryMethod.exercise;

public class CreatorElementoTenis extends Creator{

    @Override
    public IElemento factoryMethodProduct() {
        ElementoTenis elemento = new ElementoTenis();
        //elemento.setPrecio(100);
        return elemento;
    }
}
