package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.c6.sw2.e1.model.Profesor;
import idat.edu.pe.c6.sw2.e1.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	@Autowired
	private ProfesorRepository repository;
	
	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editar(Long id, Profesor profesor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor porId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
