package pe.bn.com.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import pe.bn.com.modelo.Modelo_datos_cdd;


@Repository
public interface Repository_datos extends JpaRepository<Modelo_datos_cdd, Integer> {

		//Storage Procedure - listar- BD Mysql
		@Query(value = "{call listar() }", nativeQuery = true)	
		
		public List<Modelo_datos_cdd> listaprocedure();
	
		
		
	
}
	