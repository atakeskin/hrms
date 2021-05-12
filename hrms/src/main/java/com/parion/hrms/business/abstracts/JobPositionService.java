package com.parion.hrms.business.abstracts;

import java.util.List;

import com.parion.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
	JobPosition add(JobPosition jobPosition);

}
