
public class ObserverA implements Observer {
	
	public ObserverA(Subject s) {
		// TODO Auto-generated constructor stub
		s.registerObserver(this);
	}

	public void update(int a,int b,int c) {
		// TODO Auto-generated method stub
		System.out.println("ObserverA " + a);
	}

}
