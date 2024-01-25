package pe.bn.com.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import pe.bn.com.modelo.Modelo_datos_token;

public interface IService_datos_token {

	
	public List<Modelo_datos_token> getListarToken();
	
	
}
