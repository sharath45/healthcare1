package com.slokam.f22b5.QueryDaos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.f22b5.healthcare.Medication;
@Repository
public interface QueryDao extends JpaRepository<Medication,Long>{
	@Query("select p.name,doc.name from Medication m"
			+ " join m.medicne md "
			+ " join m.complaint c"
			+ " join c.visiting v"
			+ " join c.disease d"
			+ " join v.appointment a"
			+ " join v.doctor doc"
			+ " join a.patient p"
			+ " where md.name=?1")
public List<Object[]> getPatientNameByMedicine(String name);

//==============================================================
@Query("select p.name from Medication m "
		+ "join m.medicne md "
		+ "join m.complaint c "
		+ "join c.disease di "
		+ "join c.visiting v "
		+ "join v.doctor doc "
		+ "join v.appointment a "
		+ "join a.patient p "
		+ "where di.name=?1")
public List<String> getPatientNameByDisease(String name);
//===============================================================
@Query("select p.name from Medication m "
		+ "join m.medicne md "
		+ "join m.complaint c "
		+ "join c.disease di "
		+ "join c.visiting v "
		+ "join v.doctor doc "
		+ "join v.appointment a "
		+ "join a.patient p "
		+ "where doc.name=?1")
public List<String> getPatientNameByDoctor(String name);
//================================================================
@Query("select doc.name from Medication m "
		+ "join m.medicne md "
		+ "join m.complaint c "
		+ "join c.disease di "
		+ "join c.visiting v "
		+ "join v.doctor doc "
		+ "join v.appointment a "
		+ "join a.patient p "
		+ "where p.name=?1")
public List<String> getDoctorNameByPatient(String name);
//================================================================
@Query("select DISTINCT p.id,p.name,p.date,p.phone from Medication m "
		+ "join m.medicne md "
		+ "join m.complaint c "
		+ "join c.disease di "
		+ "join c.visiting v "
		+ "join v.doctor doc "
		+ "join v.appointment a "
		+ "join a.patient p "
		+ "where a.dateTime between ?1 and ?2")
public List<Object> getAppointmentByDate(Date firstdate,Date lastdate);

//==================================================================
@Query("select DISTINCT p.id,p.name,p.date,p.phone from Appointment a "
		+ "join a.patient p "
		+ "where a.dateTime=?1")
public List<Object> getPatientByAppointmentDate(Date date);
}
