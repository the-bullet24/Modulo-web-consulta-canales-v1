package pe.bn.com.controller;

import java.awt.print.Pageable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pe.bn.com.modelo.Modelo_datos_cdd;
import pe.bn.com.repository.Repository_datos;
import pe.bn.com.repository.Repository_registro;
import pe.bn.com.service.Service_registro;

@RestController
@RequestMapping("/datos")
public class Controller_nuevo_cdd {

	@Autowired
	private Service_registro service_registro;
			
	@Autowired
	private Repository_registro repository_registro;

    
    @PostMapping("/registro")
    
    public ResponseEntity<Boolean> addRegistro(@RequestBody Modelo_datos_cdd datos_cdd){
    	return ResponseEntity.ok(
    			service_registro.addRegistro(datos_cdd.getF01_num_doc(), datos_cdd.getF01_number_mobile()));
    }
    
    
    
	

	 @GetMapping("/listar")
	    public List<Modelo_datos_cdd> listartotal() {

	    return service_registro.getListar();
	    }
	  
	    
	    
	    
		/*
		 * @DeleteMapping("/eliminar/{id}") public void eliminar(@PathVariable long id){
		 * this.service_registro.eliminar(id);
		 * 
		 * }
		 */
	    
	    @GetMapping("/eliminar")
	    public ResponseEntity<?> eliminar(){
	    	this.service_registro.eliminar(8);
	    	
	    	Map<String, String> respuesta = new HashMap<>();
	    	respuesta.put("mensaje", "ok");
	    	
	    	return ResponseEntity.ok(respuesta);
	    }

	    
	    
	    
	  
	  
	
	
	
		/*
		 * @PostMapping("/nuevo") public String crear( @Validated Modelo_datos_cdd
		 * modelo_datos_cdd, BindingResult bindingResult, RedirectAttributes ra, Model
		 * model) {
		 * 
		 * if(bindingResult.hasErrors()) {
		 * model.addAttribute("nuevocdd",modelo_datos_cdd); return "registro"; }
		 * 
		 * repository_datos.save(modelo_datos_cdd); ra.addAttribute("nuevocdd",
		 * modelo_datos_cdd);
		 * 
		 * return "redirect:/datos/nuevo"; }
		 */
	
	
	
	
	
	
	
	
	
	
}
