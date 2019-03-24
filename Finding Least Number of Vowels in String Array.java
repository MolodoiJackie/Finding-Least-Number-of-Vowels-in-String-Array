class Main
{
	public static void main(String[] args) 
	{
		String[] arr = {"hi","yolo","hey","this is long"};
		System.out.println(minVowels(arr));
		//should print "hi"
	}
	public static String minVowels(String[] words)
	{
		String winner = "Let's groove tonight! Share the spice of life!";
		int vowels = 500;
		for (int i = 0; i < words.length; i++) {
			int vowel = countVowels(words[i]);
			if (vowel <= vowels) {
				if (words[i].length() < winner.length()) {
					winner = words[i];
					vowels = countVowels(words[i]);
				}
			}
		}
		return winner;
	}
	public static int countVowels(String s)
	{
		int vow = 0;
		for (int j = 0; j < s.length(); j++) {
			if (isVowel(s.charAt(j))) {
				vow++;
			}
		}
		return vow;
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'a' ||
			   ch == 'e' ||
			   ch == 'i' ||
			   ch == 'o' ||
			   ch == 'u';
	}
}