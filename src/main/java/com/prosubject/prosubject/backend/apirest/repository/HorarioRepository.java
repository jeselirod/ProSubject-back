package com.prosubject.prosubject.backend.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prosubject.prosubject.backend.apirest.model.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long>  {
	
	@Query("select h from horario h where h.espacio.id=?1")
	List<Horario> horariosDeUnEspacio(Long id);
	
	
	

}
