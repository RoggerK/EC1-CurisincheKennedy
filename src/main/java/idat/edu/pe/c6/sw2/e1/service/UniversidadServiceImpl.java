package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.c6.sw2.e1.model.Universidad;
import idat.edu.pe.c6.sw2.e1.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {
	@Autowired
	private UniversidadRepository repository;
	
	@Override
	public void guardar(Universidad universidad) {
		// TODO Auto-generated method stub
		repository.save(universidad);
	}

	@Override
	public void editar(Long id, Universidad universidad) {
		// TODO Auto-generated method stub
		universidad.setIdUniversidad(id);
		repository.save(universidad);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Universidad> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Universidad porId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
