package com.slokam.f22b5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.Daos.HospitalDao;
import com.slokam.f22b5.healthcare.Patient;


@RestController
public class HospitalController {
	@Autowired
	private HospitalDao dao;
@RequestMapping("saveHospital")
public void setData(@RequestBody Patient p) {
	dao.save(p);
}
}
