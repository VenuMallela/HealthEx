package in.hcp.venu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.hcp.venu.entity.Health;
import in.hcp.venu.service.HealthService;

@Controller
@RequestMapping("/health")
public class HealthController {
	
	@Autowired
private HealthService service;
	@GetMapping("/show")
	public String userPage()
	{
	
	return"HealthForm";
	}
   @PostMapping("/save")
    public String getUserData(@ModelAttribute Health health,Model model)
{
		Integer id=service.saveHealth(health);
		String message="User id'"+id+"'is Created";
		//System.out.println("User id'"+health.getId()+"'is Created");
		model.addAttribute("message",message);
	return "HealthForm";
	
	
	
	
}
   
/*
 * @GetMapping("/delete") public String deleteData(@RequestParam Integer
 * id,Model model) { service.deleteData(id); String
 * message="Health Data '"+id+"'is Deleted"; List<Health> list=
 * service.getAllData(); model.addAttribute("list",list); return"HealthData";
 * 
 * }
 */}
