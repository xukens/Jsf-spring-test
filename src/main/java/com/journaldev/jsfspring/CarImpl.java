package com.journaldev.jsfspring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarImpl implements CarDao {

	static List<Car> cars = new ArrayList<>();
static {
	cars.add(0, new Car(Type.CAR, "Santro"));
	cars.add(1, new Car(Type.CAR, "Zen"));
	cars.add(2, new Car(Type.CAR, "Alto"));
	cars.add(3, new Car(Type.TRUCK, "Qualis"));
	cars.add(4, new Car(Type.TRUCK, "Innova"));
}
	@Override
	public List<Car> getCarDetails() {



		for (Car c : cars) {
			System.out.println(c);
		}

		return cars;

	}

}
