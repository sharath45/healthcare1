package com.slokam.f22b5.QueryServices;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22b5.QueryDaos.QueryDao;

@Service
public class QueryService {
	@Autowired
private QueryDao dao;
public List<Object[]> getPatientNameByMedicine(String name){
	return dao.getPatientNameByMedicine(name);
}
//=========================================================
public List<String> getPatientNameByDisease(String name){
	return dao.getPatientNameByDisease(name);
}
//=========================================================
public List<String> getPatientNameByDoctor(String name){
	return dao.getPatientNameByDoctor(name);
}
//==========================================================
public List<String> getDoctorNameByPatient(String name){
	return dao.getDoctorNameByPatient(name);
}
//===========================================================
public List<Object> getAppointmentByDate(Date firstdate,Date lastdate){
	return dao.getAppointmentByDate(firstdate, lastdate);
}
//===========================================================
public List<Object> getPatientByAppointmentDate(Date date){
	return dao.getPatientByAppointmentDate(date);
}
}
