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
		//map����char��position��ֵ��
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int length = s.length();
		for(int i =0;i<length;i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				/*
				 * ���������һ������������ӵ�char��������map�У���leftbound����
				 * ���������map�С���leftbondҪô����+1����char��ԭ��map�ĵ�һλ��
				 * ������map�е�n��char��λ��+1
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
