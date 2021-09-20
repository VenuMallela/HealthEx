package in.hcp.venu.service;

import java.util.List;

import in.hcp.venu.entity.Health;

public interface HealthService {
	
	
	Integer saveHealth(Health health);
	List<Health> getAllData();
    void deleteData(Integer id );
    
    

	
}
