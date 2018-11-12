package com.slokam.f22b5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.Daos.DiseaseDao;
import com.slokam.f22b5.healthcare.Disease;

@RestController
public class DiseaseController {
	@Autowired
	private DiseaseDao dao;
	@RequestMapping("saveDiseaseData")
public void saveDiseaseData(@RequestBody Disease d) {
	dao.save(d);
}
}
