package ua.khpi.oop.demo03;

/**
 * Приклад: визначення часу обробки даних.
 */
public final class Main {

	/** Довжина масиву. */
	private static final int LEN = 1_000_000;

	/** Кількість проходів. */
	private static final int PASS_NUM = 3;

	/** Кількість повторів. */
	private static final int REP_NUM = 100;

	/** Кількість мілісекунд в одній наносекунді. */
	private static final double DIVIDER = 1_000_000;

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
		final int[] vector = new int[LEN];
		int sum = 0, i = 0, pass = 0, rep = 0;
		long start = 0;
		for (i = 0; i < LEN; i++) {
			vector[i] = i % 2 * 2 - 1;
		}
		for (pass = 0; pass < PASS_NUM; pass++) {
			sum = 0;
			start = System.nanoTime();
			for (rep = 0; rep < REP_NUM; rep++) {
				for (i = 0; i < LEN; i++) {
					sum += vector[i];
				}
				++sum;
			}
			System.out.printf("int array:\t%d\t%d\t%.2f ms\n", LEN, sum, (System.nanoTime() - start) / DIVIDER);
		}
	}

}
