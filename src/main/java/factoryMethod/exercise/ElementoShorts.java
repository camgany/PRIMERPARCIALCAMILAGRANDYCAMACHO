package factoryMethod.exercise;

public class ElementoShorts implements IElemento {
    private int precio;
    public ElementoShorts(){}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("---------------------------------VENTA SHORTS-----------------------------------");
        System.out.println("precio: "+this.getPrecio()+"Bs");
    }
}
