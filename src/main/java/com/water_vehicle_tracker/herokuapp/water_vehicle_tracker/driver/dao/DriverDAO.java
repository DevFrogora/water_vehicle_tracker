package com.water_vehicle_tracker.herokuapp.water_vehicle_tracker.driver.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.water_vehicle_tracker.herokuapp.water_vehicle_tracker.driver.model.Driver;

public class DriverDAO {


private static final Map<String, Driver> empMap = new HashMap<String, Driver>();

static {
    initEmps();
}

private static void initEmps() {
	Driver driver = new Driver();
	driver.setName("MamaBhanja");
	driver.setAge(55);
	driver.setLatitude(21.34);
	driver.setLongitude(91.23);
	driver.setComing(false);
	
	Driver driver2 = new Driver();
	driver2.setName("Rinku Dutta");
	driver2.setAge(25);
	driver2.setLatitude(21.34);
	driver2.setLongitude(91.23);
	driver2.setComing(true);

	empMap.put("1", driver);
	empMap.put("2", driver2);
}

public static List<Driver> getAllDrivers() {
	Collection<Driver> collection = empMap.values();
	List<Driver> list = new ArrayList<Driver>();
	for (Driver driver : collection) {
	
		System.out.println(driver.toString());
	}
	list.addAll(collection);
	return list;
	
	
}

}