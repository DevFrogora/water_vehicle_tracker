package com.water_vehicle_tracker.herokuapp.water_vehicle_tracker.driver.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.water_vehicle_tracker.herokuapp.water_vehicle_tracker.driver.dao.DriverDAO;
import com.water_vehicle_tracker.herokuapp.water_vehicle_tracker.driver.model.Driver;

@Path("driver")
public class DriverService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Driver> getEmployees_JSON() 
	{
		
		System.out.println("getDriver is called ...");
//		Driver driver = new Driver();
//		driver.setName("MamaBhanja");
//		driver.setAge(55);
//		driver.setLatitude(21.34);
//		driver.setLongitude(91.23);
//		driver.setComing(false);
//		
//		Driver driver2 = new Driver();
//		driver.setName("Rinku Dutta");
//		driver.setAge(25);
//		driver.setLatitude(21.34);
//		driver.setLongitude(91.23);
//		driver.setComing(true);
		
		List<Driver> driverList = DriverDAO.getAllDrivers();
		return driverList;
	}
	
//	   @GET
//	    @Produces(MediaType.TEXT_PLAIN)
//	    public String getIt() {
//	        return "driver";
//	    }

}
