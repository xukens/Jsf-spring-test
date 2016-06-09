package com.journaldev.jsfspring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class CarBean {

	@Autowired
	CarDao carDao;

	public List<Integer> speedList(){
		return Arrays.asList(new Integer[]{1,2,3,4,5,6});
	}

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	public List<Car> fetchCarDetails() {

		return carDao.getCarDetails();
	}

	public void onChangeList(ValueChangeEvent vche){
		System.out.println(vche.getNewValue());
	}

	public void onChangeListt(ValueChangeEvent vche){
		System.out.println(vche.getNewValue());
	}

}
