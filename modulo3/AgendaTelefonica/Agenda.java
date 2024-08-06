package modulo3.AgendaTelefonica;

public class Agenda {
    private Contacto[] contactos;
    private int cont;

    public Agenda() {
        this.contactos = new Contacto[10];
        this.cont = 0;
    }

    public void registrarContacto(Contacto contacto) {
        if (cont < contactos.length) {
            contactos[cont] = contacto;
            cont++;
            System.out.println("=== Contacto registrado: "+ contacto.nombre +" ===");
        } else {
            System.out.println("=== La agenda está llena ===");
        }
    }

    public void ListarContactos() {
        System.out.println("=== Listando Contactos ===");
        for (int i = 0; i < cont; i++) {
            System.out.println("Nombre: " + contactos[i].nombre + ", numero: " + contactos[i].numero);
        }
    }

    public void buscarContacto(String buscar) {
        System.out.println("=== Buscando Contacto ===");
        for (int i = 0; i < cont; i++) {
            if (contactos[i].getNombre().equals(buscar) || contactos[i].getNumero().equals(buscar)) {
                System.out.println("Nombre contacto: " + contactos[i].nombre + ", numero contacto: " + contactos[i].numero);
                return;
            }
        }
        System.out.println("Contaco no encontrado");
    }

}
