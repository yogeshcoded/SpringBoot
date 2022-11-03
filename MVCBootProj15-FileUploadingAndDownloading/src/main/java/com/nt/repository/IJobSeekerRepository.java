package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.JobSeekerInfo;

public interface IJobSeekerRepository extends JpaRepository<JobSeekerInfo, Integer> {
	
			@Query("select resumePath from JobSeekerInfo where jsId=?1")
			public String getResumePathById(Integer  id);
		
			@Query("select photoPath from JobSeekerInfo where jsId=?1")
			public String getPhotoPathById(Integer  id);
}
