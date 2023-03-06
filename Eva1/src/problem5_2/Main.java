package problem5_2;

public class Main {

	public static void main(String[] args) {
		CheckCharacters check = new CheckCharacters() {
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
        String s1 = "MASAI";
        String s2 = "PUT";
        boolean result = check.containsChar(s1, s2);
        System.out.println(result);

        String s3 = "JAHAN";
        String s4 = "JOE";
        boolean result1 = check.containsChar(s3, s4);
        System.out.println(result1);
	}

}
