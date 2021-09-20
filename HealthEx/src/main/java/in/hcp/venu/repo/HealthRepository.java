package in.hcp.venu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hcp.venu.entity.Health;

public interface HealthRepository  extends JpaRepository<Health, Integer>{

}
