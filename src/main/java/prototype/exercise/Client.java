package prototype.exercise;

public class Client {
    public static void main (String []args){
        Camara camara = new Camara();
        camara.setLente("5mp");
        camara.setFoto(10);

        Celular template = new Celular();
        template.setModelo("A1");
        template.setTamano("12 x 23cm");
        template.setPeso(60);
        template.setCamara(camara);
        template.setOrigen("Bolivia");

        Celular celular1 = (Celular) template.clone();
        celular1.setImei(10001);

        Celular celular2 = (Celular) template.clone();
        celular2.setImei(10002);

        Celular celular3 = (Celular) template.clone();
        celular3.setImei(10003);

        Celular celular4 = (Celular) template.clone();
        celular1.setImei(10004);

        Celular celular5 = (Celular) template.clone();
        celular1.setImei(10005);

        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();
        celular4.showInfo();
        celular5.showInfo();


    }
}
