package controller;

import model.Computer;

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

    public boolean addComputer(Computer computer, int floor) {

        // Comprueba que no haya numeros seriales repetidos
        for (int i = 0; i < computersMatrix.length; i++) {
            for (int j = 0; j < computersMatrix.length; j++) {
                if (computersMatrix[i][j] != null &&
                        computersMatrix[i][j].getSerialNumber().equals(computer.getSerialNumber()) ) {
                    return false;
                }
            }
        }

        // Comprueba que el piso tenga cupo
        boolean seAnadio = false;
        for (int i = 0; i < computersMatrix[floor].length; i++) {
            if (computersMatrix[floor-1][i] == null) {
                computersMatrix[floor-1][i] = computer;
                seAnadio = true;
            }
        }
        return seAnadio;
    }

}
