package paisesapp.services;

import java.util.HashSet;
import java.util.Scanner;
import paisesapp.entities.Paises;

public class PaisesServices {

    private Scanner leer;
    private HashSet<String> paises = new HashSet();

    public PaisesServices() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();
    }

    public Paises crearPais() {

        Paises pais = new Paises();

        System.out.println("Ingrese el nombre del pais: ");
        pais.setNombrePais(leer.next());

        return pais;
    }

    public void agregarPais(Paises pais) {
        paises.add(pais.getNombrePais());
    }

    public void agregarNuevoPais() {
        boolean bandera = true;
        int aux;
        Paises paisCreado = crearPais();
        agregarPais(paisCreado);
        while (bandera) {
            System.out.println("Desea agregar un nuevo pais: \n1. Si \n2. No");
            aux = leer.nextInt();
            System.out.println("");
            if (aux == 1) {
                paisCreado = crearPais();
                agregarPais(paisCreado);
            } else {
                bandera = false;
            }
        }
    }

    public void mostrarPaises() {
        System.out.println("");
        System.out.println("Los paises actuales son: ");
        for (String pais : paises) {
            System.out.println(pais.toString());
        }
        System.out.println("Cantidad =  " + paises.size());
    }

}
