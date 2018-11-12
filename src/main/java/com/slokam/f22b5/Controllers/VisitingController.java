package com.slokam.f22b5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.f22b5.healthcare.Visiting;
import com.slokam.f22b5.service.VisitingService;

@RestController
@RequestMapping("visiting")
public class VisitingController {
	@Autowired
private VisitingService ser;
	@PostMapping
public void saveVisiting(@RequestBody Visiting v) {
	ser.saveVisiting(v);
}
}
