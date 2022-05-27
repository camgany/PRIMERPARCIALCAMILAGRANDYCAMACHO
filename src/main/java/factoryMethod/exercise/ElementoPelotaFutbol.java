package factoryMethod.exercise;

public class ElementoPelotaFutbol implements IElemento {
    private int precio;
    public ElementoPelotaFutbol(){}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("---------------------------------VENTA PELOTA FUTBOL-----------------------------------");
        System.out.println("precio: "+this.getPrecio()+"Bs");
    }
}
