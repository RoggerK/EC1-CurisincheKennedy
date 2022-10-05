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

import idat.edu.pe.c6.sw2.e1.model.Curso;
import idat.edu.pe.c6.sw2.e1.service.CursoService;

@RestController
@RequestMapping("/curso/v1")
public class CursoRestController {
	@Autowired
	private CursoService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Curso>> listar() {
		return new ResponseEntity<List<Curso>>(service.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Curso> porId(@PathVariable Long id) {
		return new ResponseEntity<Curso>(service.porId(id), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> gurdar(@RequestBody Curso curso) {
		service.guardar(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/actualizar/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@PathVariable Long id, @RequestBody Curso curso) {
		service.editar(id, curso);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Long id) {
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
