package org.ies.vehicles;

import java.util.Objects;

public abstract class Vehicle {
    protected int km;
    protected String matricula;

    public Vehicle(int km, String matricula) {
        this.km = km;
        this.matricula = matricula;
    }

    public abstract void showInfo();

    public void move(int distancia){
        km+=distancia;
        System.out.println("recorridos " + distancia + " mas");
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return km == vehicle.km && Objects.equals(matricula, vehicle.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(km, matricula);
    }
}
