package paisesapp;

import paisesapp.services.PaisesServices;

public class PaisesApp {

    public static void main(String[] args) {
        
        PaisesServices ps = new PaisesServices();
        ps.agregarNuevoPais();
        ps.mostrarPaises();
        
    }
    
}
