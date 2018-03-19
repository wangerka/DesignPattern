
public class ObserverB implements Observer{
	
	
	public ObserverB(Subject s) {
		// TODO Auto-generated constructor stub
		s.registerObserver(this);
	}

	public void update(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("ObserverB :"+a+b+c);
	}

}
