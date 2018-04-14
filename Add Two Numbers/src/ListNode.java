
public class ListNode {
	
	StringBuilder sb = new StringBuilder();

	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
	
	public String toString() {
		return outPut(this);
	}
	
	
	//�ݹ� ���Ƿ�����������
	private String outPut(ListNode l){
		
		if(l.next != null){
			sb.append(l.val + "->");
			l = l.next;
			outPut(l);
		} else {
			sb.append(l.val);
		}
		return sb.toString();
	}
}
