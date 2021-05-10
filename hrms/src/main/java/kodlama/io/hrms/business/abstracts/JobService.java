package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concretes.Job;

public interface JobService {
	
	List<Job> getAll();
}
