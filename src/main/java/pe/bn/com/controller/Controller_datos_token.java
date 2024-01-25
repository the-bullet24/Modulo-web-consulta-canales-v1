package pe.bn.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.bn.com.modelo.Modelo_datos_token;
import pe.bn.com.service.Service_datos_token;

@Controller
@RequestMapping("/datos")
public class Controller_datos_token {

	@Autowired
	private Service_datos_token datos_token;
	
	@GetMapping("/lista2")
	public String Listar_token(Model model) {
		
		List<Modelo_datos_token> listatoken = datos_token.getListarToken();
		model.addAttribute("listatoken",listatoken);
		return "mensajes_token";
	}
	
	
	
	
	
	
}
