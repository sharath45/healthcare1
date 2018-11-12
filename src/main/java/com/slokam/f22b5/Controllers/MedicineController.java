package com.slokam.f22b5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.Daos.MedicineDao;
import com.slokam.f22b5.healthcare.Medicine;
@RestController
public class MedicineController {
	@Autowired
	private MedicineDao dao;
	@RequestMapping("saveMedicineData")
private void saveMedicineData(@RequestBody Medicine m) {
	dao.save(m);
}
}
