package com.slokam.f22b5.Daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.f22b5.healthcare.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {

}
