package my_own_trie;
//import java.util.*;

public class Trie {
	Node root;
	
	public Trie() {
		root=new Node();
	}
	
	public void insertWord(String str) {
		Node temp=root;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!temp.hasChild(c)) {
				Node newNode = new Node();
				if(i==str.length()-1) {
					newNode.setEndofWord(true);
				}
				temp.addChild(c, newNode);
				temp=newNode;
			}
			else {
				temp=temp.children.get(c);
			}
		}
	}
	
	public boolean prefixSearch(String str) {
		Node temp = root;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!temp.hasChild(c)) {
				return false;
			}
			else {
				temp=temp.children.get(c);
			}
		}
		return true;
	}
	
	public boolean wordSearch(String str) {
		Node temp = root;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!temp.hasChild(c)) {
				return false;
			}
			else {
				temp=temp.children.get(c);
			}
		}
		return temp.isEndofWord;
	}
	
}
