package model;

import java.util.ArrayList;

public class Computer {

    private String serialNumber;
    private ArrayList<Incident> localIncidents;

    public Computer(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ArrayList<Incident> getLocalIncidents() {
        return localIncidents;
    }

    public void setLocalIncidents(ArrayList<Incident> localIncidents) {
        this.localIncidents = localIncidents;
    }
    
}
