package my_own_trie;
import java.util.*;

public class Node {
	Map<Character,Node> children;
	boolean isEndofWord;
	
	public Node() {
		this.children=new HashMap<Character,Node>();
		this.isEndofWord=false;
	}
	
	public void setEndofWord(boolean isEndofWord) {
		this.isEndofWord=isEndofWord;
	}
	
	public boolean getEndofWord() {
		return this.isEndofWord;
	}
	
	public void addChild(char c, Node newNode) {
		this.children.put(c, newNode);
	}
	
	public boolean hasChild(char c) {
		return this.children.containsKey(c);
	}
	
}
