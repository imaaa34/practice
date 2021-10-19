package practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import practice.entity.MutterList;

public interface MutterListRepository extends JpaRepository<MutterList, Integer> {
	
	public List<MutterList> findAllByOrderByIdDesc();
	@Query("select u from MutterList u where u.id = 1")
	public MutterList findByMutterOne();
	
}
