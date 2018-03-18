
public abstract class Dunk {
	QuackBehavior   quckB;
	FlyBehavoir flyB;
	
	public void performQuack(){
		quckB.quck();
	}
	
	public void performFly(){
		flyB.fly();
	}
	
	
	public void setQuack(QuackBehavior qb){
		this.quckB = qb;
	}
}
