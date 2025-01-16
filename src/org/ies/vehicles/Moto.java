package org.ies.vehicles;

import java.util.Objects;

public class Moto extends Vehicle{
    private String cilindrada;

    public Moto(int km, String matricula, String cilindrada) {
        super(km, matricula);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(cilindrada, moto.cilindrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cilindrada);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada='" + cilindrada + '\'' +
                ", km=" + km +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
