package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceClass implements Service {

    @Override
    public List<Car> carList() {
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("Tesla", "model S", 1000);
        Car car2 = new Car("BMW", "i8", 500);
        Car car3 = new Car("Mustang", "mach e", 800);
        Car car4 = new Car("Jaguar", "I-Pace", 700);
        Car car5 = new Car("Ioniq", "5", 300);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        return carList;
    }
}
