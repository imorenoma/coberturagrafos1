package urjc.isi.Thermostat;

import static org.junit.Assert.*;
import org.junit.*;

public class ThermostatTest {
	
	
	@Before 
		public void setUp() {
		Thermostat.pOD = "Wake"; 
		Thermostat.tmp = "Low";
	}

	
	@Test
	public void testAdvance() {
		Thermostat.advance();
		Thermostat.advance();
		Thermostat.advance();
		assertEquals("Sleep,Low",Thermostat.pOD + "," + Thermostat.tmp);
	}
	
	@Test
	public void testUp() {
		Thermostat.up();
		Thermostat.up();
		Thermostat.up();
		assertEquals("Wake,High",Thermostat.pOD + "," + Thermostat.tmp);
	}
	
	@Test
	public void testDown() {
		Thermostat.up();
		Thermostat.down();
		Thermostat.down();
		Thermostat.down();
		Thermostat.down();
		assertEquals("Wake,Low",Thermostat.pOD + "," + Thermostat.tmp);
	}
	
	@Test
	public void testEdgeCoverage() {
		Thermostat.advance();
		Thermostat.up();
		Thermostat.advance();
		Thermostat.down();
		Thermostat.advance();
		Thermostat.advance();
		Thermostat.up();
		Thermostat.advance();
		assertEquals("Sleep,High",Thermostat.pOD + "," + Thermostat.tmp);
	}
}