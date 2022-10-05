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

import idat.edu.pe.c6.sw2.e1.model.Universidad;
import idat.edu.pe.c6.sw2.e1.service.UniversidadService;

@RestController
@RequestMapping("/universidad/v1")
public class UniversidadRestController {
	@Autowired
	private UniversidadService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Universidad>> listar() {
		return new ResponseEntity<List<Universidad>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Universidad> porId(@PathVariable Long id) {
		Universidad universidad = service.porId(id);
		if (universidad != null) {
			return new ResponseEntity<Universidad>(universidad, HttpStatus.OK);
		} else {
			return new ResponseEntity<Universidad>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Universidad universidad) {
		service.guardar(universidad);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/actualizar/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@PathVariable Long id, @RequestBody Universidad universidad) {
		Universidad nuevouni = service.porId(id);
		if (nuevouni != null) {
			service.editar(id, universidad);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		Universidad uni = service.porId(id);
		if(uni != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
