import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s ="abcabcbb";
//		System.out.println(longestSubString(s));
		System.out.println(longestSubString1(s));
	}
	
	
	/*
	 * 
	 */
	public static int longestSubString1(String s){
		int res=0;
		int leftbound=0;
		//map保存char和position键值对
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int length = s.length();
		for(int i =0;i<length;i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				/*
				 * 当窗口向右滑动，如果新添加的char不包含在map中，则leftbound不变
				 * 如果包含在map中。则leftbond要么至少+1（新char在原来map的第一位）
				 * 或者是map中第n个char的位置+1
				 */
				leftbound =Math.max(leftbound, map.get(c)+1);
			}
			map.put(c,i);
			System.out.println(c+"========"+leftbound +"===="+map.toString());
			res = Math.max(res, i-leftbound+1);
			
		}
		return res;
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
