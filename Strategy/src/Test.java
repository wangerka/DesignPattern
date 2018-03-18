
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dunk d = new WhiteDunk();
		d.performFly();
		d.performQuack();
		d.setQuack(new GUAQuack());
		d.performQuack();
	}

}
