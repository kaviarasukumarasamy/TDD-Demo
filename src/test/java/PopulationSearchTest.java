import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class PopulationSearchTest {

	@Test
	public void findPopulation() {
		int expectedPopulationCount = 1000000;
		String city = "Erode";
		PopulationSearch ps = new PopulationSearch();
		int count = ps.getPopulation(city);
		Assert.assertEquals(expectedPopulationCount, count);
	}

	@Test(expected = NullPointerException.class)
	public void findPopulationWithEmptyInput() {
		int expectedPopulationCount = 0;
		String city = "";
		PopulationSearch ps = new PopulationSearch();
		int count = ps.getPopulation(city);
		Assert.assertEquals(expectedPopulationCount, count);
	}

	@Test(expected = NullPointerException.class)
	public void findPopulationWithInvalidInput() {
		int expectedPopulationCount = 0;
		String city = "XYZ";
		PopulationSearch ps = new PopulationSearch();
		int count = ps.getPopulation(city);
		Assert.assertEquals(expectedPopulationCount, count);
	}
}
