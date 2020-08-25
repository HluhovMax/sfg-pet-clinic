package io.mh.sfgpetclinic.controllers;

import static io.mh.sfgpetclinic.Constants.VETS;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/" + VETS)
@Controller
public class VetController {


	@GetMapping()
	public String listVets(Model model) {
		model.addAttribute("title", "List of Vets");
		return VETS + "/index";
	}
}
