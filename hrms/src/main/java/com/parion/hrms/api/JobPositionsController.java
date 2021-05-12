package com.parion.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parion.hrms.business.abstracts.JobPositionService;
import com.parion.hrms.entities.concretes.JobPosition;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public ResponseEntity<List<JobPosition>> getAll() {
		
		return ResponseEntity.ok(jobPositionService.getAll());
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<JobPosition> add(@RequestBody JobPosition jobPosition) {
		jobPositionService.add(jobPosition);
		return ResponseEntity.ok(jobPosition);
		
	}

}
