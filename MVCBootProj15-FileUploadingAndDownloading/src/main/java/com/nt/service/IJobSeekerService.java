package com.nt.service;

import com.nt.entity.JobSeekerInfo;

public interface IJobSeekerService {
	public String registerJobSeeker(JobSeekerInfo info);
	public Iterable<JobSeekerInfo> fetchAllEmployee();
	
		public String fetchResumePathById(Integer id);
		public String fetchPhotoPathById(Integer id);
}
