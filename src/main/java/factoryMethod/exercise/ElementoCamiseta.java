package factoryMethod.exercise;

public class ElementoCamiseta implements IElemento {
    private int precio;
    public ElementoCamiseta(){}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("---------------------------------VENTA CAMISETA-----------------------------------");
        System.out.println("precio: "+this.getPrecio()+"Bs");
    }
}
