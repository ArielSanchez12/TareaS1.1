public class Main {
    public static void main(String[] args) {

        System.out.println("Practica 1");
        Persona yo = new Persona("Ariel", 21, "Masculino");
        yo.presentarse();

        Persona persona2 = new Persona("Carla", 23, "Femenino");
        persona2.presentarse();

        System.out.println("\nPractica 2");
        Libro libro1 = new Libro("Alas de fuego", "Laura Gallego Garcia", 240);
        Libro libro2 = new Libro("Alas negras", "Laura Gallego Garcia", 432 );

        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());
    }
}
