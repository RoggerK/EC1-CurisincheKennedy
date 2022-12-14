package idat.edu.pe.c6.sw2.e1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import idat.edu.pe.c6.sw2.e1.model.MallaCuricular;
import idat.edu.pe.c6.sw2.e1.service.MallaCuricularService;

@RestController
@RequestMapping("/mallacuricular/v1")
public class MallaCuricularRestController {
	@Autowired
	private MallaCuricularService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<MallaCuricular>> listar() {
		return new ResponseEntity<List<MallaCuricular>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<MallaCuricular> porId(@PathVariable Long id) {
		MallaCuricular malla = service.porId(id);
		if (malla != null) {
			return new ResponseEntity<MallaCuricular>(malla, HttpStatus.OK);
		} else {
			return new ResponseEntity<MallaCuricular>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody MallaCuricular mallaCuricular) {
		service.guardar(mallaCuricular);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/actualizar/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@PathVariable Long id, @RequestBody MallaCuricular mallaCuricular) {
		MallaCuricular nuevomalla = service.porId(id);
		if (nuevomalla != null) {
			service.editar(id, mallaCuricular);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		MallaCuricular malla = service.porId(id);
		if(malla != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
