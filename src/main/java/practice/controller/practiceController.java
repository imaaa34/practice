package practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import practice.entity.MutterList;
import practice.form.MutterListForm;
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
	
	// リクエストでやってきたformからデータを受け取る場合に使う
	@PostMapping("add")
	public String addMutter(@ModelAttribute MutterListForm mutterListForm) {
		mutterListService.save(mutterListForm.getId(), mutterListForm.getName(), mutterListForm.getComment());
		return "redirect:/";
	}
	
	@GetMapping("delete")
	public String deleteMutter(@RequestParam Integer id) {
		mutterListService.delete(id);
		return "redirect:/";
	}
}
