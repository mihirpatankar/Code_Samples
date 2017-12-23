package my_own_trie;
import java.util.*;



public class Trie {
	Node root;
	
	public Trie() {
		root=new Node();
	}
	
	public void insertWord(String word) {
		Node temp=root;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			if(!temp.hasChild(c)) {
				Node newNode = new Node();		
				temp.addChild(c, newNode);
				temp=newNode;
			}
			else {
				temp=temp.children.get(c);
			}
		}
		temp.setEndofWord(true);
	}
	
	public boolean prefixSearch(String word) {
		Node temp = root;
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			if(!temp.hasChild(c)) {
				return false;
			}
			else {
				temp=temp.children.get(c);
			}
		}
		return true;
	}
	
	public boolean wordSearch(String word) {
		Node temp = root;
		for(int i=0;i<word.length();i++) {
			char c = word.charAt(i);
			if(!temp.hasChild(c)) {
				return false;
			}
			else {
				temp=temp.children.get(c);
			}
		}
		return temp.isEndofWord;
	}
	
	public boolean deleteWord(String str) {
		if(!wordSearch(str)) {
			return false;
		}
		Node temp = root;
		Stack<Node> stack = new Stack<Node>();
		stack.push(temp);
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			temp=temp.children.get(c);
			stack.push(temp);
		}
		if(temp.children.size()>0) {
			temp.setEndofWord(false);
			return true;
		}
		Node backtrack = stack.pop();
		backtrack.setEndofWord(false);
		
		int index = str.length()-1;
		
		while(!stack.isEmpty()) {
			if(backtrack.children.size()==0 && !backtrack.isEndofWord) {
				backtrack = stack.pop();
				backtrack.children.remove(str.charAt(index));
				System.out.println("Deleted: " + str.charAt(index));
				index--;
			}
			else {
				stack=null;
				return true;
			}
		}
		stack=null;
		return true;
	}
}
