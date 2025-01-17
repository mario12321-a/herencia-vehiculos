package org.ies.vehicles;

import java.util.Objects;

public class Camion extends Vehicle{
    private int numEjes;

    public Camion(int km, String matricula, int numEjes) {
        super(km, matricula);
        this.numEjes = numEjes;
    }

    @Override
    public void showInfo() {
        System.out.println("camion con matricula: " + matricula + " tiene numero de ejes: " + numEjes + " tiene: " + km + " kilometros ");
    }
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return numEjes == camion.numEjes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numEjes);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "numEjes=" + numEjes +
                ", km=" + km +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
