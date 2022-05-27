package factoryMethod.exercise;

public class CreatorElementoPelotaFutbol extends Creator{

    @Override
    public IElemento factoryMethodProduct() {
        ElementoPelotaFutbol elemento = new ElementoPelotaFutbol();
        // elemento.setPrecio(332);
        return elemento;
    }
}
