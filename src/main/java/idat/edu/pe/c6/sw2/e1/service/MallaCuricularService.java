package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import idat.edu.pe.c6.sw2.e1.model.MallaCuricular;

public interface MallaCuricularService {
	void guardar(MallaCuricular mallaCuricular);
	void editar(Long id, MallaCuricular mallaCuricular);
	void eliminar(Long id);
	List<MallaCuricular>listar();
	MallaCuricular porId(Long id);
}
