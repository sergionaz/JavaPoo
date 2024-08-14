import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Sergio Nazar", "Odontólogo");

        Patient myPatient = new Patient("Jorge Nazar", "jorge@gmail.com");
        myPatient.setWeight(80.3);
        System.out.println(myPatient.getWeight());

        Integer i = 1;

    }
}