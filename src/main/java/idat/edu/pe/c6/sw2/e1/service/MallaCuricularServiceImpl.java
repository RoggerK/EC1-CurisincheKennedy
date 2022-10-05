package idat.edu.pe.c6.sw2.e1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.c6.sw2.e1.model.MallaCuricular;
import idat.edu.pe.c6.sw2.e1.repository.MallaCuricularRepository;

@Service
public class MallaCuricularServiceImpl implements MallaCuricularService {
	@Autowired
	private MallaCuricularRepository repository;
	
	@Override
	public void guardar(MallaCuricular mallaCuricular) {
		// TODO Auto-generated method stub
		repository.save(mallaCuricular);
	}

	@Override
	public void editar(Long id, MallaCuricular mallaCuricular) {
		// TODO Auto-generated method stub
		mallaCuricular.setIdMalla(id);
		repository.saveAndFlush(mallaCuricular);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<MallaCuricular> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public MallaCuricular porId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
