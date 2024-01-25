package pe.bn.com.service;

import java.util.List;

import pe.bn.com.modelo.Modelo_datos_cdd;

public interface IService_registro {
	
	public void eliminar(long id);
	
	public List<Modelo_datos_cdd> getListar();
	
    public boolean addRegistro(String f01_num_doc, String f01_number_mobile);

	
}
