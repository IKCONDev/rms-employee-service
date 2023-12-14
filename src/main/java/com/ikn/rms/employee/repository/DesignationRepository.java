package com.ikn.rms.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikn.rms.employee.entity.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {
	
	Optional<Designation> findByDesignationName(String desgName);

}
