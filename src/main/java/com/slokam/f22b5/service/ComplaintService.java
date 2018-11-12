package com.slokam.f22b5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22b5.Daos.ComplaintDao;
import com.slokam.f22b5.healthcare.Complaint;
import com.slokam.f22b5.healthcare.Medication;

@Service
public class ComplaintService {
	@Autowired
private ComplaintDao dao;
public void saveComplaint(Complaint c) {
	List<Medication> medicationList=c.getMedication();
	for (Medication medication : medicationList) {
		medication.setComplaint(c);
	}
	dao.save(c);
}

}
