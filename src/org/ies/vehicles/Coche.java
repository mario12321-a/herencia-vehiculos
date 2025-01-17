package org.ies.vehicles;

import java.util.Objects;

public class Coche extends Vehicle{
    private int numPuertas;
    private int Caballos;

    public Coche(int km, String matricula, int numPuertas, int caballos) {
        super(km, matricula);
        this.numPuertas = numPuertas;
        Caballos = caballos;
    }

    @Override
    public void showInfo() {
        System.out.println("el coche con matricula: " + matricula + " con: " + km + " kilometros tiene: " + numPuertas + " puertas y " + Caballos + " caballos");
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getCaballos() {
        return Caballos;
    }

    public void setCaballos(int caballos) {
        Caballos = caballos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coche coche = (Coche) o;
        return numPuertas == coche.numPuertas && Caballos == coche.Caballos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numPuertas, Caballos);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numPuertas=" + numPuertas +
                ", Caballos=" + Caballos +
                ", km=" + km +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
