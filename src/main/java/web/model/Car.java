package web.model;

import org.springframework.stereotype.Component;


public class Car {
    private String name;
    private String model;
    private int horses;

    public Car(String name, String model, int horses) {
        this.name = name;
        this.model = model;
        this.horses = horses;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public double getHorses() { return horses; }
    public void setHorses(int horses) { this.horses = horses; }
}
