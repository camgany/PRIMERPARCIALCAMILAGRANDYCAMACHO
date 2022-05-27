package factoryMethod.exercise;

public class ElementoMedidas implements IElemento {
    private int precio;
    public ElementoMedidas(){}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("---------------------------------VENTA MEDIAS-----------------------------------");
        System.out.println("precio: "+this.getPrecio()+"Bs");
    }
}
