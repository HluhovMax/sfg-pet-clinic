package io.mh.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

	@GetMapping({"/owners", "/owners/index", "/owners/index.html"})
	public String listOwners(Model model) {

		model.addAttribute("title", "Index Page");

		return "owners/index";
	}
}
