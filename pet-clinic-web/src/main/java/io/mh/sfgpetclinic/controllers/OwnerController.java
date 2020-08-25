package io.mh.sfgpetclinic.controllers;

import static io.mh.sfgpetclinic.Constants.OWNERS;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/" + OWNERS)
@Controller
public class OwnerController {

	@GetMapping()
	public String listOwners(Model model) {
		model.addAttribute("title", "List of Owners");
		return OWNERS + "/index";
	}
}
