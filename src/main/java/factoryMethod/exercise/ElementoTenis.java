package factoryMethod.exercise;

public class ElementoTenis implements IElemento {
    private int precio;
    public ElementoTenis(){}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("---------------------------------VENTA TENIS-----------------------------------");
        System.out.println("precio: "+this.getPrecio()+"Bs");
    }
}
