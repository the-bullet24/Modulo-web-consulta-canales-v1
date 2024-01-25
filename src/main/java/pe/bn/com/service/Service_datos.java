package pe.bn.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.modelo.Modelo_datos_cdd;
import pe.bn.com.modelo.Modelo_datos_token;
import pe.bn.com.repository.Repository_datos;

@Service
public class Service_datos implements IService_datos{

	@Autowired
	Repository_datos datos;

	@Override
	public List<Modelo_datos_cdd> listaprocedure() {
		// TODO Auto-generated method stub
		return datos.listaprocedure();
	}



	
}
