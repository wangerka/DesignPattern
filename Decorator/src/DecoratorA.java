
public class DecoratorA extends Decorator {

	public DecoratorA(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public String getDes() {
		// TODO Auto-generated method stub
		return "DecoratorA decorate (" + component.getDes()+")";
	}

}
