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

	}

	@Override
	public void editar(Long id, MallaCuricular mallaCuricular) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<MallaCuricular> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MallaCuricular porId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
