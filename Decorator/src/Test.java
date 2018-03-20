
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component c = new ConcreteComponent();
		c=new DecoratorA(c);
		c=new DecoratorB(c);
		System.out.println(c.getDes());
	}

}
