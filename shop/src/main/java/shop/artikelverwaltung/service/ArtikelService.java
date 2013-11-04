package shop.artikelverwaltung.service;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import shop.artikelverwaltung.domain.Artikel;
import shop.util.Mock;


public class ArtikelService implements Serializable {
	private static final long serialVersionUID = -5105686816948437276L;
	
		@NotEmpty
		@Pattern(regexp = "\\d{4}")
	public Artikel findArtikelById(Long id) {
		// TODO id pruefen
		// TODO Datenbanzugriffsschicht statt Mock
		
		return Mock.findArtikelById(id);
	}
}
