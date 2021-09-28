package com.acme.domain;

public class Liquid extends Good{

    private double radius;

    public Liquid(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasureType, boolean flammable, double weightPerUofM, double radius) {
        super(name, modelNumber, height, unitOfMeasureType, flammable, weightPerUofM);
        this.radius = radius;
    }

    @Override
    public ContainerType getContainerType() {
        return ContainerType.LIQUIDTWENTY;
    }

    /**
    public final boolean canShipViaPostOffice(){
        return (!isFlammable()) ? true : false;
    }**/



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * getHeight();
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "volume =" + radius +
                '}' + super.toString();
    }

}
