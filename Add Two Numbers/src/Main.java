
public class Main {
	
	public static void main(String[] args) {
		int[] a={1,2,3,5,7,8,9};
		System.out.println(buildListNode1(a).toString());
//		buildListNode1(a);
		
//		
//		String a1 =null;
//		String b = null;
//		String c;
//		c = new String("hello");
//		a1 = c;
//		b = c;
//		b += "world";
//		System.out.println(b);
//		System.out.println(a1);
	}
	
	private static ListNode buildListNode1(int[] input){
        ListNode first = null,last = null,newNode;//三个对象的引用
        if(input.length>0){
            for(int i=0;i<input.length;i++){
            	/*
            	 * 1，new ListNode  以ListNode类为模板，在堆空间中创建一个ListNode类对象
            	 * 2，（）执行构造函数
            	 * 3，ListNode newNode 创建了一个ListNode类的引用变量，也就是说用来指向ListNode对象的对象引用
            	 * 4，“=”，这个等号操作符表示使对象引用newNode指向刚创建的ListNode对象。
            	 */
                newNode=new ListNode(input[i]);
                newNode.next=null;
                if(first==null){
                	/*
                	 * 此时 first last newNode 都指向第一次创建的ListNode类对象
                	 */
                    first=newNode;
                    last=newNode;
                    //********************
                }else{
                    last.next=newNode;
                    last=newNode;
                }
            }
        }
        return first;
    }

}
