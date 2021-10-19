package practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import practice.entity.MutterList;

// <対象Entityクラス, IDのデータ型>
public interface MutterListRepository extends JpaRepository<MutterList, Integer> {
	
	public List<MutterList> findAllByOrderByIdDesc();
	@Query("select u from MutterList u where u.id = 1")
	public MutterList findByMutterOne();
	
}
