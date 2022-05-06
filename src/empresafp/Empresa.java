
package empresafp;


public class Empresa {
    String nombre;
    String concello;
    String web;

    public Empresa(String nombre, String web, String concello) {
        this.nombre = nombre;
        this.concello = concello;
        this.web = web;
    }

    @Override
    public String toString() {
        return nombre + " (" + concello + ")";
    }
           
}
