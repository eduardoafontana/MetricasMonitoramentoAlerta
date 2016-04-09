import static org.junit.Assert.*;

import org.junit.Test;


public class Test1 {

	@Test
	public void testNovaMetrica() {
		Metrica metrica = new Metrica(new Tipo(), new Host());
		assertNotNull(metrica);
		assertNotNull(metrica.getTipo());
	}
	
	@Test
	public void tesNovaMedicao() {
		Metrica metrica = new Metrica(new Tipo(), new Host());
		boolean retorno = metrica.novaMedicao();
		
		assertTrue(retorno);
		assertTrue(metrica.historicoMedicoes().size() > 0);
		assertNotNull(metrica.historicoMedicoes().get(0));
	}
	
	@Test 
	public void testUltimaMedicao(){
		Metrica metrica = new Metrica(new Tipo(), new Host());
		metrica.novaMedicao();
		metrica.novaMedicao();
		metrica.novaMedicao();
		
		assertEquals(metrica.getUltimaMedicao(), metrica.historicoMedicoes().get(2));
	}
	
	@Test
	public void testNotificar(){
		Alerta alerta = new Alerta();
		
		Metrica metrica = new Metrica(new Tipo(), new Host());
		metrica.addObserver(alerta);
		metrica.novaMedicao();
		
		assertEquals(alerta.getMensagem(), "OK");
	}
	
	@Test
	public void testTipoMetrica(){
		Tipo tipo = new Tipo();
		assertNotNull(tipo);
	}

	@Test
	public void testMedicao() {
		Medicao medicao = new Medicao();
		assertNotNull(medicao);
	}
	
	@Test
	public void testHost() {
		Host host = new Host();
		assertNotNull(host);
	}
	
	@Test
	public void testAlerta() {
		Alerta alerta = new Alerta();
		assertNotNull(alerta);
	}	
}
