package idat.edu.pe.c6.sw2.e1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.c6.sw2.e1.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long> {

}
