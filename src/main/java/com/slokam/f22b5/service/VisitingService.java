package com.slokam.f22b5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.f22b5.Daos.VisitingDao;
import com.slokam.f22b5.healthcare.Visiting;

@Service
public class VisitingService {
	@Autowired
private VisitingDao dao;
public void saveVisiting(Visiting v) {
	dao.save(v);
}
}
