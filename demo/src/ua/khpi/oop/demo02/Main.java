package ua.khpi.oop.demo02;

/**
 * Завдання: вивести символи української та англійської абетки до консолі.
 *
 * @author xone
 */
public final class Main {

	/**
	 * Символи української абетки.
	 */
	private static final String[] UKRAINIAN_ALPHABET = { "А а   Б б   В в   Г г   Ґ ґ   Д д   Е е",
			"Є є   Ж ж   З з   И и   І і   Ї ї   Й й", "К к   Л л   М м   Н н   О о   П п   Р р",
			"С с   Т т   У у   Ф ф   Х х   Ц ц", "Ч ч   Ш ш   Щ щ   Ь ь   Ю ю   Я я" };

	/**
	 * Символи англійської абетки.
	 */
	private static final String[] ENGLISH_ALPHABET = { "A a   B b   C c   D d   E e   F f   G g",
			"H h   I i   J j   K k   L l   M m   N n", "O o   P p   Q q   R r   S s   T t   U u",
			"V v   W w   X x   Y y   Z z" };

	/**
	 * Масив алфавітів.
	 */
	private static final String[][] ALPHABETS = { UKRAINIAN_ALPHABET, ENGLISH_ALPHABET };

	/**
	 * Приватний конструктор для запобігання створення екземплярів.
	 */
	private Main() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Виведення масиву рядків до консолі.
	 *
	 * @param alphabet масив рядків
	 */
	public static void printAlphabet(final String[] alphabet) {
		for (final String line : alphabet) {
			System.out.println(line);
		}
	}

	/**
	 * Перевірка та демонстрація розроблених класів.
	 *
	 * @param args параметри командного рядка
	 */
	public static void main(final String[] args) {
		System.out.println("Task 02");
		System.out.println("АБВ\u0410\u0411\u0412");
		// Виведення масиву абеток.
		for (final String[] alphabet : ALPHABETS) {
			printAlphabet(alphabet);
		}
	}
}
