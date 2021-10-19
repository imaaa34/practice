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
}
