
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char a = "%".charAt(0);
		String text = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите текст,в конце поставьте пустую строку");
		while (scanner.hasNextLine()) {
			String newLine = scanner.nextLine();
			text += ("\n"+newLine);
			if (newLine.isEmpty()) {
				break;
			}
		}
		System.out.println("Какую n- ю букву каждого слова заменить символом “%”?");
		int position = scanner.nextInt();

		Paragraph p = new Paragraph(text);
		p.replaceIn(position, a);
		System.out.println(p.toString());

		scanner.close();
	}
}