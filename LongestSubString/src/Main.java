import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s ="gfsgsvsvfvfdsdsvd";
		System.out.println(longestSubString(s));
	}
	
	public static int longestSubString(String s){
		int ans =0;
		int len = s.length();
		for(int i=0;i<len;i++){
			for(int j=i+1;j<=len;j++){
				if(isAllUnique(s,i,j)){
					ans = Math.max(ans, j-i);
				} else break;
			}
		}
		return ans;
	}
	
	public static boolean isAllUnique(String s, int start, int end){
//		Set<Character> list = new HashSet<Character>();
		System.out.println(start+"===="+end);
		List<Character> list = new ArrayList<Character>();
		for(int i=start;i<end;i++){
			Character c = s.charAt(i);
			if(list.contains(c)){
				System.out.println(list.toString());
				return false;
			}
			list.add(c);
		}
		System.out.println(list.toString());
		return true;
	}

}
