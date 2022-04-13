package ua.khpi.oop.javafx;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Демонстрація простої віконної програми з використанням <a href=
 * "http://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-overview.htm">JavaFX</a>.
 */
public class Main extends Application {

	/** Шлях до пакету ресурсів. */
	private static final String RES_PATH = "ua/khpi/oop/javafx/res/";

	/** Шлях до файлу PNG-зображення. */
	private static final String RES_SMILE_PNG = RES_PATH + "smile.png";

	/** Шлях до файлу CSS. */
	private static final String RES_MAIN_CSS = RES_PATH + "Main.css";

	/** Текст кнопки відображення картинки. */
	private static final String TEXT_DO_IT = "Do it!";

	/** Текст кнопки завершення програми. */
	private static final String TEXT_EXIT = "Exit";

	/** Затримка ефекту згасання. */
	private static final int FADING_DELAY = 2000;

	/** Ширина вікна. */
	private static final int ROOT_WIDTH = 200;

	/** Висота вікна. */
	private static final int ROOT_HEIGHT = 300;

	/**
	 * Точка входу консольної програми.
	 *
	 * @param args
	 *            параметри командного рядка
	 */
	public static void main(final String[] args) {
		System.out.println("Begin...");
		// Виконати віконну програму.
		Application.launch(args);
		System.out.println("Bye!");
	}

	/**
	 * Точка входу JavaFX-програми.
	 *
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public final void start(final Stage primaryStage) throws Exception {
		final Button btnDoit = new Button(TEXT_DO_IT);
		final Button btnExit = new Button(TEXT_EXIT);
		final Image image = new Image(RES_SMILE_PNG);
		final ImageView view = new ImageView(image);
		view.setOpacity(0);
		final FadeTransition transition = new FadeTransition(Duration.millis(FADING_DELAY), view);
		transition.setFromValue(0);
		transition.setToValue(1);
		final StackPane root = new StackPane(view, btnDoit, btnExit);
		root.setPrefSize(ROOT_WIDTH, ROOT_HEIGHT);
		StackPane.setAlignment(view, Pos.TOP_CENTER);
		StackPane.setAlignment(btnDoit, Pos.BOTTOM_LEFT);
		StackPane.setAlignment(btnExit, Pos.BOTTOM_RIGHT);
		btnDoit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent event) {
				transition.play();
			}
		});
		btnExit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent event) {
				Platform.exit();
			}
		});
		final Scene scene = new Scene(root);
		scene.getStylesheets().add(RES_MAIN_CSS);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
