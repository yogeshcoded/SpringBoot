package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekerInfo;
import com.nt.repository.IJobSeekerRepository;

@Service("jsService")
public class JobSeekerService implements IJobSeekerService {
	@Autowired
	private IJobSeekerRepository jsRepo;

	@Override
	public String registerJobSeeker(JobSeekerInfo info) {
		return "Canditate save with " + jsRepo.save(info).getJsId() + " id value";
	}

	@Override
	public Iterable<JobSeekerInfo> fetchAllEmployee() {
		Iterable<JobSeekerInfo> jsList= jsRepo.findAll();
				return jsList;
	}

	@Override
	public String fetchResumePathById(Integer id) {
			return jsRepo.getResumePathById(id);
	}
	
	@Override
	public String fetchPhotoPathById(Integer id) {
		return jsRepo.getPhotoPathById(id);
	}
	
}
