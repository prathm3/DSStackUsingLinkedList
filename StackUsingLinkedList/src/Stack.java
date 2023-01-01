
public class Stack {
	Node top;

	public Stack() {
		this.top = null;
	}
	
	public void push(int value) {
		Node tmp = new Node(value);
		
		if(this.top == null) {
			top = tmp;
		}else {
			tmp.next = top;
			top = tmp;
		}
		// tmp.next = head;
		// head = tmp;
	}
	
	public void pop() {
		if(this.top != null) {
			/*
			 * Node tmp = this.head; this.head = tmp.next;
			 * 
			 * tmp.next = null; tmp = null;
			 */
			if(this.top.next == null) {
				Node tmp = this.top;
				this.top = null;
				
				tmp.next = null;
				tmp = null;
			}else {
				Node tmp = this.top;
				this.top = tmp.next;
				
				tmp.next = null;
				tmp = null;
			}
		}
	}
	
	public void print() {
		if(this.top == null) {
			System.out.println("LL is Null");
		}else {
			Node it = top;
			while(it != null) {
				System.out.print(it.data + "-->");
				it = it.next;
			}
		}
	}
}
