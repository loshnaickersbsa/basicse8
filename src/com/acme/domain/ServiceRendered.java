package com.acme.domain;

public class ServiceRendered implements Product{

    private String name;
    private int estimatedTaskDuration;
    private boolean timeAndMaterials;


    public ServiceRendered(String name, int estimatedTaskDuration, boolean timeAndMaterials) {
        this.name = name;
        this.estimatedTaskDuration = estimatedTaskDuration;
        this.timeAndMaterials = timeAndMaterials;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ServiceRendered{" +
                "name='" + name + '\'' +
                ", estimatedTaskDuration=" + estimatedTaskDuration +
                " day service}";
    }
}
