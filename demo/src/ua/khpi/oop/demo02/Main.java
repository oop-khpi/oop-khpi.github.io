package ua.khpi.oop.demo02;

/**
 * Завдання: вивести символи українського та російського алфавітів до консолі.
 *
 * @author xone
 */
public final class Main {

	/**
	 * Символи українського алфавіту.
	 */
	private static final String[] UKRAINIAN_ALPHABET = { "А а   Б б   В в   Г г   Ґ ґ   Д д   Е е",
			"Є є   Ж ж   З з   И и   І і   Ї ї   Й й", "К к   Л л   М м   Н н   О о   П п   Р р",
			"С с   Т т   У у   Ф ф   Х х   Ц ц", "Ч ч   Ш ш   Щ щ   Ь ь   Ю ю   Я я" };

	/**
	 * Символи російського алфавіту.
	 */
	private static final String[] RUSSIAN_ALPHABET = { "А а   Б б   В в   Г г   Д д   Е е   Ё ё",
			"Ж ж   З з   И и   Й й   К к   Л л   М м", "Н н   О о   П п   Р р   С с   Т т   У у",
			"Ф ф   Х х   Ц ц   Ч ч   Ш ш   Щ щ   Ъ ъ", "Ы ы   Ь ь   Э э   Ю ю   Я я" };

	/**
	 * Масив алфавітів.
	 */
	private static final String[][] ALPHABETS = { UKRAINIAN_ALPHABET, RUSSIAN_ALPHABET };

	/**
	 * Приватний конструктор класу утиліт.
	 */
	private Main() {
		// Пусте тіло.
	}

	/**
	 * Виведення масиву рядків до консолі.
	 *
	 * @param alphabet
	 *            масив рядків
	 */
	public static void printAlphabet(final String[] alphabet) {
		for (final String line : alphabet) {
			System.out.println(line);
		}
	}

	/**
	 * Перевірка та демонстрація розроблених класів.
	 *
	 * @param args
	 *            параметри командного рядка
	 */
	public static void main(final String[] args) {
		System.out.println("Task 02");
		System.out.println("АБВ\u0410\u0411\u0412");
		// Виведення масиву алфавітів.
		for (final String[] alphabet : ALPHABETS) {
			printAlphabet(alphabet);
		}

	}

}
