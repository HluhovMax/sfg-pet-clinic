package io.mh.sfgpetclinic.controllers;

import static io.mh.sfgpetclinic.Constants.OWNERS;
import io.mh.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/" + OWNERS)
@Controller
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@GetMapping()
	public String listOwners(Model model) {
		model.addAttribute("title", "List of Owners");
		model.addAttribute(OWNERS, ownerService.findAll());
		return "owners/index";
	}
}
