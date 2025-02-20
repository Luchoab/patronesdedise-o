package patronesdediseño;

import Singleton.Configuracion;



public class PatronesDeDiseño {

    public static void main(String[] args) {
        Configuracion cn = Configuracion.getInstancia();
        
        cn.setIdioma("Español");
        cn.setGenero("Rock");
        cn.setEstilo("Alternativo");
        System.out.println(cn.toString());
    }
    
}
