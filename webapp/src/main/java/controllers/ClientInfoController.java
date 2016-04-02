package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientInfoController {

	@RequestMapping(value = "/clientInfo", method=RequestMethod.GET)
	public String displayHome(){
		
		return "clientInfo";
	}
}
