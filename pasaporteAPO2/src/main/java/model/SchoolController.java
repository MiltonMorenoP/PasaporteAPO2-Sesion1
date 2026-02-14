package model;

public class SchoolController {

    private String name;
    private int hoursSpentSupport;

    public final int FLOORS = 5;
    public final int COL = 10;
    public final int HOURMAXSUPPORT = 100;

    private Computer[][] computersMatrix;

    public SchoolController(String name) {
        this.name = name;
        this.hoursSpentSupport = 0;
        this.computersMatrix = new Computer[FLOORS][COL];
    }

}
