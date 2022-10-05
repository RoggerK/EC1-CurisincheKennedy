package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import idat.edu.pe.c6.sw2.e1.model.Curso;

public interface CursoService {
	void guardar(Curso curso);
	void editar(Long id, Curso curso);
	void eliminar(Long id);
	List<Curso>listar();
	Curso porId(Long id);
}
