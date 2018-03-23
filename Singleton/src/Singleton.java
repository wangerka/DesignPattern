
public class Singleton {
	private static Singleton mInstance;
	
	
	//DCL
	public static Singleton getInstance(){
		if(mInstance == null){
//			synchronized (Singleton.class) {
//				if (mInstance == null) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					mInstance = new Singleton();
//				}
//			}
		}
		return mInstance;
	}
}
