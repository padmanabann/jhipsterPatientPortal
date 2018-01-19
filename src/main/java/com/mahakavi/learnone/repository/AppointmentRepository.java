package com.mahakavi.learnone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahakavi.learnone.domain.Appointment;



@SuppressWarnings("unused")
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
	List<Appointment> findByUserId(Long userId); 
}
