package Singleton;

public class Configuracion {
    
    private String idioma;
    private String genero;
    private String estilo;

        
    private static Configuracion instancia;
    
    private Configuracion(){}
    
    public static Configuracion getInstancia(){
        if (instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }
    
    
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Configuracion{" + "idioma=" + idioma + ", genero=" + genero + ", estilo=" + estilo + '}';
    }
    


 
    
        

    
    
    
}
