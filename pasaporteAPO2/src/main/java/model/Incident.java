package model;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;

public class Incident {

    private LocalDate dateReport;
    private String description;
    private boolean solution;
    private int solutionHours;

    private Incident(LocalDate dateReport, String description) {
        this.dateReport = dateReport;
        this.description = description;
    }

    public LocalDate getDateReport() {
        return dateReport;
    }

    public void setDateReport(LocalDate dateReport) {
        this.dateReport = dateReport;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSolution() {
        return solution;
    }

    public void setSolution(boolean solution) {
        this.solution = solution;
    }

    public int getSolutionHours() {
        return solutionHours;
    }

    public void setSolutionHours(int solutionHours) {
        this.solutionHours = solutionHours;
    }
}
