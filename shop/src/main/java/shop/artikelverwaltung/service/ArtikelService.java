package shop.artikelverwaltung.service;

import java.io.Serializable;

import shop.artikelverwaltung.domain.Artikel;
import shop.util.interceptor.Log;
import shop.util.Mock;

@Log
public class ArtikelService implements Serializable {
	private static final long serialVersionUID = -5105686816948437276L;

	public Artikel findArtikelById(Long id) {
		// TODO id pruefen
		// TODO Datenbanzugriffsschicht statt Mock
		@NotEmpty
		@Pattern(regexp = "\\d{4}")
		return Mock.findArtikelById(id);
	}
}
