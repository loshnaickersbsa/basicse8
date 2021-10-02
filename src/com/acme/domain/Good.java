package com.acme.domain;

public abstract class  Good implements Product {

    public enum UnitOfMeasureType {LITER, GALLON, CUBIC_METER, CUBIC_FEET};

    public enum ContainerType {FORTYFOOT, TWENTYFOOT, LIQUIDTWENTY};

    public Good(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasureType, boolean flammable, double weightPerUofM) {
        this.name = name;
        this.modelNumber = modelNumber;
        this.height = height;
        this.unitOfMeasureType = unitOfMeasureType;
        this.flammable = flammable;
        this.weightPerUofM = weightPerUofM;
    }

    private String name;
    private int modelNumber;
    private double height;
    private UnitOfMeasureType unitOfMeasureType;
    private boolean flammable;
    private double weightPerUofM;

    public ContainerType getContainerType(){
        return  ContainerType.TWENTYFOOT;
    }

    public final boolean canShipViaPostOffice(){
        return (!isFlammable()) ? true : false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasureType;
    }

    public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasureType) {
        this.unitOfMeasureType = unitOfMeasureType;
    }

    public boolean isFlammable() {
        return flammable;
    }

    public void setFlammable(boolean flammable) {
        this.flammable = flammable;
    }

    public double getWeightPerUofM() {
        return weightPerUofM;
    }

    public void setWeightPerUofM(double weightPerUofM) {
        this.weightPerUofM = weightPerUofM;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", modelNumber=" + modelNumber +
                ", height=" + height +
                ", unitOfMeasureType=" + unitOfMeasureType +
                ", flammable=" + flammable +
                ", weightPerUofM=" + weightPerUofM +
                '}';
    }

    public abstract double volume();

    public double weight() {
        return volume() * weightPerUofM;
    }

}
