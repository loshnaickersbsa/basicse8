package com.acme.domain;

public class Solid extends  Good {

    private double width;
    private double length;

    public Solid(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasureType, boolean flammable, double weightPerUofM, double width, double length) {
        super(name, modelNumber, height, unitOfMeasureType, flammable, weightPerUofM);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double volume() {
        return width * length * getHeight();
    }

    public String toString() {
        return super.toString() + " that is " + volume() + " " +
                super.getUnitOfMeasure() + " in size";
    }

    @Override
    public ContainerType getContainerType() {
        return volume() < 20 ? ContainerType.TWENTYFOOT: ContainerType.FORTYFOOT;
    }
}
