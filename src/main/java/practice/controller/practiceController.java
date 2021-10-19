package practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import practice.entity.MutterList;
import practice.service.MutterListService;

@Controller
public class practiceController {
	@Autowired
	MutterListService mutterListService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<MutterList> mutters = mutterListService.findAll();
		List<MutterList> muttersDesc = mutterListService.findAllDesc();
		MutterList mutterOne = mutterListService.findByMutterOne();
		
		model.addAttribute("mutters", mutters);
		model.addAttribute("muttersDesc", muttersDesc);
		model.addAttribute("mutterOne", mutterOne);
		
		return "index";
	}
	
//	@PostMapping("/")
//	public String add() {
//	}
}
