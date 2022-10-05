package idat.edu.pe.c6.sw2.e1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universidad")
public class Universidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUniversidad;
	private String universidad;
}
