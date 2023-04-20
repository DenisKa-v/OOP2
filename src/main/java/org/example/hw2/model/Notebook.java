package org.example.hw2.model;

import lombok.Data;

@Data
public class Notebook {
    private String model;
    private Integer ramSize;
    private Integer diskSize;
    private String osName;
    private String color;

    public Notebook(String model, Integer ramSize, Integer diskSize, String osName, String color) {
        this.model = model;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.osName = osName;
        this.color = color;
    }

    public Notebook() {
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", ramSize=" + ramSize + " GB" +
                ", diskSize=" + diskSize + " GB" +
                ", osName='" + osName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
