package practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.entity.MutterList;
import practice.repository.MutterListRepository;

@Service
public class MutterListService {
	
	@Autowired
	MutterListRepository mutterListRepository;
	
	public List<MutterList> findAll() {
		return mutterListRepository.findAll();
	}
	
	public List<MutterList> findAllDesc() {
		return mutterListRepository.findAllByOrderByIdDesc();
	}
	
	public MutterList findByMutterOne() {
		return mutterListRepository.findByMutterOne();
	}
	
	public void save(Integer id, String name, String comment) {
		MutterList mutterList = new MutterList();
		mutterList.setId(id);
		mutterList.setName(name);
		mutterList.setComment(comment);
		mutterListRepository.save(mutterList);
	}
}
