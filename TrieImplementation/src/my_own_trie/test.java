package my_own_trie;

public class test {
	public static void main(String args[]) {
		Trie trie = new Trie();
		trie.insertWord("ab");
		trie.insertWord("abcd");
		System.out.println("Word Search :" + trie.wordSearch("abcd"));
		System.out.println("Word Search :" + trie.wordSearch("ab"));
		System.out.println("Delete word :" + trie.deleteWord("ab"));
		System.out.println("Word Search :" + trie.wordSearch("ab"));
		
	}
}
