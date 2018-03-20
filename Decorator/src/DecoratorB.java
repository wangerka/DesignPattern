
public class DecoratorB extends Decorator {

	public DecoratorB(Component c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public String getDes() {
		// TODO Auto-generated method stub
		return "DecoratorB decorate (" + component.getDes()+")";
	}

}
