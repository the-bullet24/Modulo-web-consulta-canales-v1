package pe.bn.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.bn.com.modelo.Modelo_datos_token;


@Repository
public interface Repository_datos_token extends JpaRepository<Modelo_datos_token, Integer>{
	
	@Query(value = "{call listar_token() }", nativeQuery = true)
	public List<Modelo_datos_token> Listtoken();
	
}
