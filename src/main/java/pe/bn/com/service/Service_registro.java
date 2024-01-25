package pe.bn.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pe.bn.com.modelo.Modelo_datos_cdd;
import pe.bn.com.repository.Repository_datos;
import pe.bn.com.repository.Repository_registro;

@Service
public class Service_registro  implements IService_registro{

	@Autowired
	private Repository_registro repository_registro;
	
	@Override
	public void eliminar(long id) {
		List<Long> lista = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
		  lista.add(0L);
		}

		repository_registro.deleteAllById(lista);
		
	}

	@Override
	public List<Modelo_datos_cdd> getListar() {
		return repository_registro.findAll();
	}

	@Override
	public boolean addRegistro(String f01_num_doc, String f01_number_mobile) {
		try {
			repository_registro.addRegistro(f01_num_doc, f01_number_mobile);
			return true;
			
		} catch (Exception e) {
			
		}
		return false;
	}


	

	  
	}
	  
	
	
	
	
	
	

