package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.c6.sw2.e1.model.Curso;
import idat.edu.pe.c6.sw2.e1.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
	private CursoRepository repository;
	
	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);
	}

	@Override
	public void editar(Long id, Curso curso) {
		// TODO Auto-generated method stub
		curso.setIdCurso(id);
		repository.saveAndFlush(curso);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Curso porId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
