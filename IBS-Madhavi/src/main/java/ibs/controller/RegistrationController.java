package ibs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wellsfargo.batch7.group3.dto.KycDetailsDto;
import com.wellsfargo.batch7.group3.exception.BankException;

import ibs.exception.BankException;
import ibs.model.RegistrationModel;
import ibs.service.RegistrationService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
	private RegistrationService rgService;
	
	@GetMapping
	public ModelAndView groupsAction() throws BankException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register/registration-page");
		mv.addObject("registration",rgService.getAll());
		mv.addObject("register",new RegistrationModel());
		return mv;
	}
	
	
	
	@PostMapping("/add")
	public ModelAndView addAction(
			@ModelAttribute("registration") @Valid RegistrationModel register,
			BindingResult result) throws BankException {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register/registration-page");
		
		if(result.hasErrors()) {
			mv.addObject("register",register);	
		}else {
			rgService.add(register);
			mv.addObject("group",new RegistrationModel());
		}
		
		mv.addObject("groups",rgService.getAll());
		return mv;
	}	
	
	@PostMapping("/register")
	public ModelAndView registerAction(@ModelAttribute("register") @Valid RegistrationModel newUser, BindingResult result) throws BankException {
		ModelAndView mv = null;
		if (result.hasErrors()) {
			System.out.println(result.getErrorCount()+" errors exist");
			System.out.println(result.getAllErrors());
			mv = new ModelAndView("registrationForm.jsp", "register", newUser);
		} else {
			rgService.register(newUser);
			mv = new ModelAndView("redirect:/registrationSuccess.jsp");
			mv.addObject("newUser", newUser );
		}
		return mv;
	}
}
