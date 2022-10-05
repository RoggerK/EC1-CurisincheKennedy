package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import idat.edu.pe.c6.sw2.e1.model.Profesor;

public interface ProfesorService {
	void guardar(Profesor profesor);
	void editar(Long id, Profesor profesor);
	void eliminar(Long id);
	List<Profesor>listar();
	Profesor porId(Long id);
}
