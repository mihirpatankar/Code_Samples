package my_own_trie;

public class test {
	public static void main(String args[]) {
		Trie trie = new Trie();
		trie.insertWord("lmno");
		trie.insertWord("abcdefgh");
		trie.insertWord("abcdxyz");
		System.out.println("Word Search :" + trie.deleteWord("lmno"));
		System.out.println("Word Search :" + trie.wordSearch("abcdefgh"));
		System.out.println("Word Search :" + trie.wordSearch("abcdxyz"));
		System.out.println("Word Search :" + trie.prefixSearch("abcd"));
	}
}
