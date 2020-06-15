package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.gestione.Verifica;

@Controller
public class ControllerTesto {
	
	@RequestMapping(value  = "/calcolatore")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		Verifica v = new Verifica();
		ModelAndView vista = new ModelAndView("risultato");
		vista.addObject("testo", testo);
		vista.addObject("checkPal", v.verificaPalindromo(testo));
		vista.addObject("numeroParF", v.numeroParoleFrase(testo));
		vista.addObject("numeroParP", v.numeroParolePalindromo(testo));
		return vista;
	}
	

}
