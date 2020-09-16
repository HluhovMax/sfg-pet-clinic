package io.mh.sfgpetclinic.controllers;

import static io.mh.sfgpetclinic.Constants.VETS;
import io.mh.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/" + VETS)
@Controller
public class VetController {

	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@GetMapping()
	public String listVets(Model model) {
		model.addAttribute("title", "List of Vets");
		model.addAttribute(VETS, vetService.findAll());
		return "vets/index";
	}
}
