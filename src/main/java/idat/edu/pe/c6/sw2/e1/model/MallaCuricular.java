package idat.edu.pe.c6.sw2.e1.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mallacuricular")
public class MallaCuricular {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMalla;
	private Date anio;

	public MallaCuricular() {
	}

	public Long getIdMalla() {
		return idMalla;
	}

	public void setIdMalla(Long idMalla) {
		this.idMalla = idMalla;
	}

	public Date getAnio() {
		return anio;
	}

	public void setAnio(Date anio) {
		this.anio = anio;
	}
}
