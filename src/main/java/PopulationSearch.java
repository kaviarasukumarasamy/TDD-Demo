import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

	private Map<String, Integer> getPopulationStatistics() {
		Map<String, Integer> populationMap = new HashMap<String, Integer>();
		populationMap.put("Erode", 1000000);
		populationMap.put("Coimbatore", 2000000);
		populationMap.put("Chennai", 3000000);
		populationMap.put("Bangalore", 400000);
		return populationMap;
	}

	public int getPopulation(String city) {
		Map<String, Integer> populationMap = null;
		int populationCount = 0;
		if (city.isEmpty()) {
			throw new NullPointerException("Input should not be empty ");
		}
		populationMap = getPopulationStatistics();
		if (!populationMap.containsKey(city)) {
			throw new NullPointerException("Invalid Input");

		} else {
			populationCount = populationMap.get(city);
		}
		return populationCount;
	}
//user can give empty input
//input may not be present in db
}
