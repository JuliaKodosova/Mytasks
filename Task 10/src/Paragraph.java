
public class Paragraph implements IReplace {
	public String text;

	public Paragraph(String text) {
		this.text = text;
	}

	public void replaceIn(int position, char a) {
		String newText = "";
		String[] ArrayOfLines = text.split("\n");
		for (int i = 0; i < ArrayOfLines.length; i++) {
			String sentenceText = ArrayOfLines[i];
			Sentence sentence=new Sentence(sentenceText);
			sentence.replaceIn(position, a);
			newText = newText +" " + sentence.toString()+" ";
		}
		text = newText;
	}

	@Override
	public String toString() {
		return text;
	}
}
