package mx.com.warriordev.HolaSpring.dao;

import mx.com.warriordev.HolaSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
