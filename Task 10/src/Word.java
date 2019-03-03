
public class Word extends Sentence {


	public Word(String text) {
		super(text);
	}

	public void replaceIn(int position, char y) {
		char[] arrayOfCharacters = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			arrayOfCharacters[i] = text.charAt(i);
		}
		for (int i = position; i <= arrayOfCharacters.length; i += position) {
			arrayOfCharacters[i - 1] = y;
		}
		text = new String(arrayOfCharacters);
	}

	@Override
	public String toString() {
		return text;
	}
}
