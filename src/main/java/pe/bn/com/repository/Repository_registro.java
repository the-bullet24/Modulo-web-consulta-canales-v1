package pe.bn.com.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import pe.bn.com.modelo.Modelo_datos_cdd;



//@EnableJpaRepositories
@Repository
public interface Repository_registro extends JpaRepository<Modelo_datos_cdd, Long>{

	@Modifying
	@Query (value= "{call insertar_cdd(:f01_num_doc, :f01_number_mobile) }", nativeQuery = true )
	@Transactional
	
	public void addRegistro(String f01_num_doc, String f01_number_mobile);
	
}
