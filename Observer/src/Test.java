
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weather = new WeatherData();
		ObserverA ob = new ObserverA(weather);
		Observer b = new ObserverB(weather);
		
		weather.setMeasure(1, 2, 3);
	}

}
