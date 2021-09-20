package in.hcp.venu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcp.venu.entity.Health;
import in.hcp.venu.repo.HealthRepository;
import in.hcp.venu.service.HealthService;

@Service
public class HealthServiceImpl  implements HealthService{

	@Autowired
	private HealthRepository repo;
	
	@Override
	public Integer saveHealth(Health health) {
		health=repo.save(health);
		return health.getId();
		
	}
	@Override
	public List<Health> getAllData() {
		List<Health> list=repo.findAll();
		return list;
	}
	@Override
	public void deleteData(Integer id) {
		repo.deleteById(id);
		
	}
}
