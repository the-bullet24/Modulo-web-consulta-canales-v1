package pe.bn.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import pe.bn.com.modelo.Modelo_datos_cdd;
import pe.bn.com.modelo.Modelo_datos_token;
import pe.bn.com.service.Service_datos;
import pe.bn.com.service.Service_registro;

@Controller
@RequestMapping("/datos")

public class Controller_datos_cdd {

	@Autowired
	private Service_datos datos;
	
	
	
	
	@GetMapping("/listacdd")
	public String Listar_token(Model model) {
		
		List<Modelo_datos_cdd> listacdd = datos.listaprocedure();
		model.addAttribute("listacdd",listacdd);
		return"mensajes_cdd";
	}
	
	
	
	
	
	
	
	//Plantilla  de Menu - inicio 
	
	@GetMapping("/menu")
	public String menu() {
		return "/plantilla/plantilla_header";
	}
	
	
	/*
	 * @GetMapping("/lista") public String lista(Model model) {
	 * List<Modelo_datos_cdd> lista = datos.lista(); model.addAttribute("datos",
	 * lista); return "mensajes_cdd"; }
	 */

	/*
	 * @GetMapping("/lista") public String lista(Model model, Pageable pageable) {
	 * Page<Modelo_datos_cdd> datosPage = service_registro.listarPaginado(pageable);
	 * model.addAttribute("datos", datosPage); return "mensajes_cdd"; }
	 */
	
}








