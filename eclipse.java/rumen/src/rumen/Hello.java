package rumen;
class Trie {
    public Trie[] next;
    public boolean isEnd;
    
    public Trie() {
        next = new Trie[26];
        isEnd = false;
    }
}
public class Hello {	
	public static void main(String[] args) {
		Trie A = new Trie();
		System.out.println(A.isEnd);
	}
	
}
