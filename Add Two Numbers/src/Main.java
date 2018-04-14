
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
        ListNode first = null,last = null,newNode;
        if(input.length>0){
            for(int i=0;i<input.length;i++){
                newNode=new ListNode(input[i]);
                newNode.next=null;
                if(first==null){
                	//********************
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
