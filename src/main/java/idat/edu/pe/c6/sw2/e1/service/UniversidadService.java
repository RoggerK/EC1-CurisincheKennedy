package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import idat.edu.pe.c6.sw2.e1.model.Universidad;

public interface UniversidadService {
	void guardar(Universidad universidad);
	void editar(Long id, Universidad universidad);
	void eliminar(Long id);
	List<Universidad>listar();
	Universidad porId(Long id);
}
