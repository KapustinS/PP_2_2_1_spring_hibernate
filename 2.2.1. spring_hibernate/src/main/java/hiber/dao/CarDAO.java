package hiber.dao;

import hiber.model.Car;

import java.util.List;

public interface CarDAO {

    void add(Car car);

    List<Car> carList();
}
