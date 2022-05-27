package singleton.exercise;

import singleton.structure.Singleton3;

import java.util.Date;
import java.util.Stack;

public class TemaTesis {
    private static TemaTesis temaTesis;
    private String titulo;
    private String mencion;
    private Estudiante estudiante;


    private TemaTesis(String titulo){
        this.titulo = titulo;
    }
    private synchronized static void  multiThreadControl(){
        if (temaTesis== null)
            temaTesis= new TemaTesis(temaTesis.titulo);
        //evita que la instancia se genere varias veces
    }
    public static TemaTesis getInstance(){
         if (temaTesis== null)
            multiThreadControl();
        return temaTesis;
    }

    public void verInf(TemaTesis temaTesis){
        System.out.println("--------------------------------");
        System.out.println("Titulo: "+titulo);
        System.out.println("Mencion: "+mencion);
        System.out.println("Datos del Estudiante: ");
        System.out.println("  - Nombre: "+estudiante.getNombre());
        System.out.println("  - CI: "+estudiante.getCi());
        System.out.println("Hora Creacion: "+new Date());
    }


}
