package com.slokam.f22b5.QueryControllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.QueryServices.QueryService;

@RestController
@RequestMapping("querymedication")
public class QueryController {
	@Autowired
	private QueryService ser;
	@GetMapping("/{name}")
public List<Object[]> getPatientNameByMedicine(@PathVariable("name")String name){
	return ser.getPatientNameByMedicine(name);
}
//================================================
@GetMapping("byDisease/{name}")
public List<String> getPatientNameByDisease(@PathVariable("name") String name){
	return ser.getPatientNameByDisease(name);
}
//================================================
@GetMapping("/byDoctor/{name}")
public List<String> getPatientNameByDoctor(@PathVariable("name") String name){
	return ser.getPatientNameByDoctor(name);
}
//================================================
@GetMapping("/byPatient/{name}")
public List<String> getDoctorNameByPatient(@PathVariable("name") String name){
	return ser.getDoctorNameByPatient(name);
}
//=================================================
@GetMapping("/byDate/{fdate}/{ldate}")
public List<Object> getAppointmentByDate(@PathVariable("fdate")@DateTimeFormat(pattern="yyyy-MM-dd") Date firstdate,
		@PathVariable("ldate") @DateTimeFormat(pattern="yyyy-MM-dd") Date lastdate){
	return ser.getAppointmentByDate(firstdate, lastdate);
}
//=================================================
@GetMapping("appDate/{date}")
public List<Object> getPatientByAppointmentDate(@PathVariable("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
	return ser.getPatientByAppointmentDate(date);
}
}
