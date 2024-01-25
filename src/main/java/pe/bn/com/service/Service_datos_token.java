package pe.bn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.modelo.Modelo_datos_token;
import pe.bn.com.repository.Repository_datos_token;

@Service
public class Service_datos_token implements IService_datos_token{

	@Autowired
	Repository_datos_token datos_token;

	@Override
	public List<Modelo_datos_token> getListarToken() {
		// TODO Auto-generated method stub
		return datos_token.Listtoken();
	}
	
	
}
