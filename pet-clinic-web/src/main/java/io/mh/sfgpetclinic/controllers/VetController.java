package io.mh.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {


	@GetMapping({"/vets", "/vets/index", "/vets/index.html"})
	public String listVets(Model model) {

		model.addAttribute("title", "Index Page");

		return "vets/index";
	}
}
