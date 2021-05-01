package stringDemo;

public class Main {

	public static void main(String[] args) {
		String message = "  Bugün hava cok güzel.  "; // Strings are a char array[]
		System.out.println(message);

		System.out.println("Number of elements : " + message.length());
		System.out.println("5.element : " + message.charAt(4));
		System.out.println("------------------------------");
		System.out.println(message.concat(" Yasasin!")); // concatenation - birlestirme
		System.out.println("------------------------------");
		System.out.println(message.startsWith("b"));
		System.out.println(message.endsWith("."));
		System.out.println("------------------------------");
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println("------------------------------");
		System.out.println(message.indexOf("av")); // soldan arama
		System.out.println(message.lastIndexOf('a')); // sagdan arama
		System.out.println("------------------------------");
		String newMessage = message.replace(' ', '-'); // replace - degistirme
		System.out.println(newMessage);
		System.out.println(message.substring(2, 5));

		System.out.println("------------------------------");
		
		for (String wort : message.split(" ")) {
			System.out.println(wort);
		}

		System.out.println("------------------------------");
		
		System.out.println((message).toLowerCase());
		System.out.println((message).toUpperCase());
		System.out.println(message.trim()); //bastaki ve sondaki bosluklari siler
		
		System.out.println("------------------------------");
	}

}
