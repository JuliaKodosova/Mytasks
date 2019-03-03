
public class Sentence extends Paragraph {

	public Sentence(String text) {
		super(text);
	}

	public void replaceIn(int position, char a) {
		String newText = "";
		String[] ArrayOfWords = text.split(" ");
		for (int i = 0; i < ArrayOfWords.length; i++) {
			String wordText = ArrayOfWords[i];
			Sentence word=new Word(wordText);
			word.replaceIn(position, a);
			newText = newText + " " + word.toString();
		}
		text = newText;
	}

	@Override
	public String toString() {
		return text;
	}
}
