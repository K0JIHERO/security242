package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Service;
import web.service.ServiceClass;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    Service service = new ServiceClass();

    @RequestMapping("/cars")
    public String loopOfCars(Model model, @RequestParam (defaultValue = "5") int count) {
        List<Car> limitedList = service.carList().stream().limit(count).collect(Collectors.toList());
        model.addAttribute("cars", limitedList);
        return "cars";
    }

}