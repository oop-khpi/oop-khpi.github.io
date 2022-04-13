package ua.khpi.oop.demo01;

/**
 * Завдання: розробити найпростішу консольну програму для відображення імені
 * класу та параметрів командного рядка.
 */
public final class Main {

	/**
	 * Приватний конструктор для запобігання створення екземплярів.
	 */
	private Main() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Точка входу консольної програми.
	 *
	 * @param args
	 *            параметри командного рядка
	 */
	public static void main(final String[] args) {
		// Відображення імені класу, що містить метод main().
		System.out.println(Main.class.getName());
		// Відображення параметрів командного рядка.
		for (final String arg : args) {
			System.out.println(arg);
		}
	}
}
