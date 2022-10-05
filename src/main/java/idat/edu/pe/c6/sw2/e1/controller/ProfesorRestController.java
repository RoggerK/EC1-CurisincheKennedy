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

import idat.edu.pe.c6.sw2.e1.model.Profesor;
import idat.edu.pe.c6.sw2.e1.service.ProfesorService;

@RestController
@RequestMapping("/profesor/v1")
public class ProfesorRestController {
	@Autowired
	private ProfesorService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Profesor>> listar() {
		return new ResponseEntity<List<Profesor>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Profesor> porId(@PathVariable Long id) {
		Profesor profesor = service.porId(id);
		if (profesor != null) {
			return new ResponseEntity<Profesor>(profesor, HttpStatus.OK);
		} else {
			return new ResponseEntity<Profesor>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Profesor profesor) {
		service.guardar(profesor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/actualizar/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@PathVariable Long id, @RequestBody Profesor profesor) {
		Profesor nuevoprofesor = service.porId(id);
		if (nuevoprofesor != null) {
			service.editar(id, profesor);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		Profesor profesor = service.porId(id);
		if(profesor != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
