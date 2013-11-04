package shop.artikelverwaltung.service;

import shop.artikelverwaltung.domain.Artikel;
import shop.util.cdi.MockService;
import shop.util.interceptor.Log;

@MockService
@Log
public class ArtikelServiceMock extends ArtikelService {
	private static final long serialVersionUID = -2919310633845009282L;

	/**
	 * {inheritDoc}
	 */
	@Override
	public Artikel findArtikelById(Long id) {
		final Artikel artikel = new Artikel();
		artikel.setId(id);
		artikel.setBezeichnung("Bezeichnung_" + id + "_Mock");
		return artikel;
	}
}
