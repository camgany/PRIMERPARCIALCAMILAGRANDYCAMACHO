package prototype.exercise;

public class Celular implements ICelular{
    private String modelo;
    private String tamano;
    private int peso;
    private Camara camara;
    private int imei;
    private String origen;
    public Celular (){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone() {
        Camara cloneC = new Camara();
        cloneC.setFoto(this.getCamara().getFoto());
        cloneC.setLente(this.getCamara().setLente());

        Celular clone = new Celular();
        clone.setModelo(this.getModelo());
        clone.setTamano(this.getTamano());
        clone.setPeso(this.getPeso());
        clone.setCamara(cloneC);

        return null;
    }
}
