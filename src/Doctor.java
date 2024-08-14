public class Doctor {
    // Attributos
    static int id = 0; // Autoincrement
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

    // Me creo un constructor diferente a mi gusto.
    Doctor(String name, String speciality) {
        id++;
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.name = name;
        this.speciality = speciality;
    }

    // Comportamientos
    public void showName() {
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}