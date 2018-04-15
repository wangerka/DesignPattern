
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {23, 35, 123, 233, 10000, 39949};
		System.out.println(sort(a, 233));
	}

	
	public static int sort(int[] array, int b){
		int low = 0;
		int high = array.length - 1;
		int mid;
		while(low <= high){
			mid = (low + high)/2;
			if(array[mid] == b){
				return mid+1;
			} else if(array[mid] < b){
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
