
public class Test {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread[] thrs = new MyThread[10];
		
		for(int i=0;i<thrs.length;i++){
			thrs[i] = new MyThread();
		}
		
		for(int j =0;j<thrs.length;j++){
			thrs[j].start();
		}
		
	}


}
