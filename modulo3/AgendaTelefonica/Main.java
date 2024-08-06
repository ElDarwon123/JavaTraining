package modulo3.AgendaTelefonica;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.registrarContacto(new Contacto("Steven", "1234"));
        agenda.registrarContacto(new Contacto("Daniel", "4356"));
        agenda.registrarContacto(new Contacto("Sebastian", "2343"));
        agenda.registrarContacto(new Contacto("Ana", "1213"));
        agenda.registrarContacto(new Contacto("Ana", "1213"));
        agenda.registrarContacto(new Contacto("Ana", "1213"));
        agenda.registrarContacto(new Contacto("Ana", "1213"));
        agenda.registrarContacto(new Contacto("Ana", "1213"));
        agenda.registrarContacto(new Contacto("Ana", "1213"));
        agenda.registrarContacto(new Contacto("Ana", "1213"));

        agenda.ListarContactos();

        agenda.buscarContacto("null");
        agenda.buscarContacto("Steven");
    }
}
