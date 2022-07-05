import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static Node head = new Node('A', null, null);
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char root = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			insertNode(head, root,left,right);
		}
		
		preOrder(head);
		System.out.println();
		inOrder(head);
		System.out.println();
		postOrder(head);
		System.out.println();
		
		
		
	}
	
	//Node 클래스 생성
	static class Node{
		char value;
		Node left;
		Node right;
		
		Node(char value, Node left, Node right){
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}

	public static void insertNode(Node temp, char root, char left, char right) {
		
		
		if (temp.value == root) {//루트와 넣을 노드의 값이 같으면
			temp.left = (left == '.' ? null : new Node(left,null,null));//넣을 값이 .이면 null을 넣고 .이 아니면 Node 생성해서 삽입
			temp.right = (right == '.' ? null : new Node(right,null,null)); //넣을 값이 .이면 null을 넣고 .이 아니면 Node 생성해서 삽입
		}
		else {//루트의 값과 삽입하려는 노드의 값이 다르면
			if(temp.left != null) insertNode(temp.left, root, left, right);//왼쪽 자식이 없다면 새로운 노드 삽입
			if(temp.right != null) insertNode(temp.right, root, left, right);//오른쪽 자식이 없다면 새로운 노드 삽입
		}
	}
	//전위 중앙 -> 왼쪽 자식 -> 오른쪽 자식
	public static void preOrder(Node node) {
		if(node ==null) return;//노드의 값이 null이면 반환
		System.out.print(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}
	//중위 왼쪽자식 -> 중앙 -> 오른쪽 자식
	public static void inOrder(Node node) {
		if(node ==null) return;
		inOrder(node.left);
		System.out.print(node.value);
		inOrder(node.right);
	}
	//후위 - 왼쪽자식 -> 오른쪽 자식 -> 중앙
	public static void postOrder(Node node) {
		if(node ==null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value);
	}

}