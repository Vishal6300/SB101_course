package problem5_2;

public interface CheckCharacters {
	boolean containsChar(String s1, String s2);
	
	CheckCharacters checkCharacters = new CheckCharacters() {
	    @Override
	    public boolean containsChar(String s1, String s2) {
	        for (int i = 0; i < s2.length(); i++) {
	            if (s1.indexOf(s2.charAt(i)) != -1) {
	                return true;
	            }
	        }
	        return false;
	    }
	};
}
