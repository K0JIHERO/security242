package web.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface Service {
    public List <Car> carList();

}
