
public class Main {
	/*
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
		Output: 7 -> 0 -> 8
		Explanation: 342 + 465 = 807.
	 */
	
	public static void main(String[] args) {
		int[] a={2,5,3,4};
		int[] b ={5,6,4};
		System.out.println(buildListNode1(a).toString());
		System.out.println(buildListNode1(b).toString());
		ListNode l1 = buildListNode1(a);
		ListNode l2 = buildListNode1(b);
		System.out.println(addListNode1(l1, l2).toString());
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
        ListNode first = null,last = null,newNode;//�������������
        if(input.length>0){
            for(int i=0;i<input.length;i++){
            	/*
            	 * 1��new ListNode  ��ListNode��Ϊģ�壬�ڶѿռ��д���һ��ListNode�����
            	 * 2������ִ�й��캯��
            	 * 3��ListNode newNode ������һ��ListNode������ñ�����Ҳ����˵����ָ��ListNode����Ķ�������
            	 * 4����=��������ȺŲ�������ʾʹ��������newNodeָ��մ�����ListNode����
            	 */
                newNode=new ListNode(input[i]);
                newNode.next=null;
                if(first==null){
                	/*
                	 * ��ʱ first last newNode ��ָ���һ�δ�����ListNode�����
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
	
	
	/*
	 * if�����ж�+�ݹ� �ᵼ�� ÿ�ζ�����ִ�з��� ��ʱ�����ᱻ����
	 */
	static ListNode result = null;
	static ListNode last = null;
	static int carry=0;
	public static ListNode addListNode(ListNode l1, ListNode l2){
		
		ListNode curr;
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		int num1=0;
		int num2=0;
		int total=0;
		if(l1 != null || l2 != null || carry != 0){
			if(l1 != null){
				num1 = l1.val;
				l1=l1.next;
			}
			if(l2 != null){
				num2 = l2.val;
				l2=l2.next;
			}
			total = num1+num2+carry;
			if(total>10){
				carry =total/10;
			}
			curr=new ListNode(total%10);
			curr.next=null;
			if(result == null){
				result = curr;
				last = curr;
			} else {
				last.next = curr;
				last = curr;
			}
			if(l1 !=null || l2!=null){
				addListNode(l1, l2);
			}
		}
		return result;
	}

	/*
	 * ���ܵ�����У�
		1.��������first��second��û�е���β��
		2.һ������β����һ��û�У�
		3.����������β��
		
		ע�⣡��һ��������β����������������βʱ������carry��Ϊ0�������Բ��ܽ�����
	 */
	public static ListNode addListNode1(ListNode l1, ListNode l2){
		ListNode result=null,last=null,newNode;
		int carry=0;

		int total=0;
		
		while(l1!=null || l2 != null || carry!=0){
			int num1=0;
			int num2=0;
			if(l1 !=null){
				num1 = l1.val;
				l1=l1.next;
			}
			if(l2!=null){
				num2 = l2.val;
				l2=l2.next;
			}
//			System.out.println(num1+"===="+num2+"======"+carry);
			total = num1+num2+carry;
			newNode = new ListNode(total%10);
			newNode.next=null;
			if(total>10){
				carry=1;
			} else {
				carry =0;
			}
			if(result == null){
				result = newNode;
				last = newNode;
			} else {
				last.next = newNode;
				last = newNode;
			}
		}
		
		return result;
	}
}
