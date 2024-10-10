public class Persona {
    String nombre;
    int edad;
    String genero;

    public Persona(String nombreT, int edadT, String generoT) {
        this.nombre = nombreT;
        this.edad = edadT;
        this.genero = generoT;
    }

    public void presentarse() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}
