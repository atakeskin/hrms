package com.parion.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parion.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
