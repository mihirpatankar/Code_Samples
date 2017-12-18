package my_own_trie;

public class test {
	public static void main(String args[]) {
		Trie trie = new Trie();
		trie.insertWord("abcd");
		trie.insertWord("abcdef");
		trie.insertWord("abc");
		trie.insertWord("lmno");
		System.out.println("Prefix Search :" + trie.prefixSearch("ab"));
		System.out.println("Word Search :" + trie.wordSearch("lmno"));
		System.out.println("Word Search :" + trie.wordSearch("abcde"));
	}
}
