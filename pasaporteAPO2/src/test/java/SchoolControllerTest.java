import model.Computer;
import controller.SchoolController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolControllerTest {

    public SchoolController controller;

    public void setUpInitial(){
        controller = new SchoolController("Escuelita");
    }

    public void setUp1(){
        setUpInitial();

        controller.addComputer(new Computer("A01"),1);
        controller.addComputer(new Computer("A03"),1);
        controller.addComputer(new Computer("A04"),1);
        controller.addComputer(new Computer("A05"),1);
        controller.addComputer(new Computer("A06"),1);
    }

    @Test
    public void addComputerTest() { //Primer piso vacío
        setUpInitial();

        Computer computer = new Computer("A01");
        boolean seAnadio = controller.addComputer(computer,1);
        assertTrue(seAnadio);

    }

    @Test
    public void addComputerTest2() { //Primer piso lleno
        setUpInitial();

        controller.addComputer(new Computer("A02"),1);
        controller.addComputer(new Computer("A03"),1);
        controller.addComputer(new Computer("A04"),1);
        controller.addComputer(new Computer("A05"),1);
        controller.addComputer(new Computer("A06"),1);
        controller.addComputer(new Computer("A07"),1);
        controller.addComputer(new Computer("A08"),1);
        controller.addComputer(new Computer("A09"),1);
        controller.addComputer(new Computer("A010"),1);
        controller.addComputer(new Computer("A011"),1);

        Computer computer = new Computer("A01");
        boolean seAnadio = controller.addComputer(computer,1);
        assertFalse(seAnadio);

    }

    @Test
    public void addComputerTest3() { // Primer piso disponible pero ya existe el mismo numero serial
        setUp1();

        Computer computer = new Computer("A01");
        boolean seAnadio = controller.addComputer(computer,1);
        assertFalse(seAnadio);

    }


}
