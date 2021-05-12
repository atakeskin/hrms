package com.parion.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parion.hrms.business.abstracts.JobPositionService;
import com.parion.hrms.dataAccess.abstracts.JobPositionDao;
import com.parion.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDto;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPosition) {
		super();
		this.jobPositionDto = jobPosition;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return jobPositionDto.findAll();
	}

	@Override
	public JobPosition add(JobPosition jobPosition) {
		return jobPositionDto.save(jobPosition);
		
	}

}
