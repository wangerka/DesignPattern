import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject {
	
	private int tempuare;
	private int hdmity;
	private int pressure;
	private List<Observer> ObserverList;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		ObserverList = new ArrayList();
	}

	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		ObserverList.add(o);
	}

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		ObserverList.remove(o);
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<ObserverList.size();i++){
			ObserverList.get(i).update(tempuare,hdmity,pressure);
		}
	}

	
	public void setMeasure(int a,int b,int c){
		tempuare =a ;
		hdmity = b;
		pressure = c;
		notifyObservers();
	}
}
