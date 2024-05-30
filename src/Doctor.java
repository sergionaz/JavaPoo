public class Doctor {
    int id;
    String name;
    String speciality;

    /*
    * Método constructor.
    * No hace falta definirlo. Solamente, si quiero agregar comportamiento particular.
    * Puedo incluso, definir más de un método constructor
    * */
    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
    }
    Doctor(String name) {
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }
}