import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProjetoRelogioDigital extends Application {
	
	final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("HH:mm:ss");

	@Override
	public void start(Stage palco) {
		Label rotuloTempo = new Label();
		rotuloTempo.setStyle("-fx-font-size: 26pt; -fx-text-fill: YELLOW;");

		KeyFrame keyFrameAtualizar = new KeyFrame(Duration.ZERO, e -> {
			rotuloTempo.setText(LocalDateTime.now().format(FORMATADOR));
		});

		KeyFrame keyFrameIntervalo = new KeyFrame(Duration.seconds(1));
		// esse keyframe vai definir o intervalo de atualização, que no caso é a cada segundo, rodando indefinidamente (relogio.setCycleCount()).
		
		Timeline relogio = new Timeline();
		relogio.getKeyFrames().addAll(keyFrameAtualizar, keyFrameIntervalo);

		relogio.setCycleCount(Animation.INDEFINITE);
		relogio.play();

		VBox vboxLayout = new VBox(rotuloTempo);
		vboxLayout.setAlignment(Pos.CENTER);
		vboxLayout.setStyle("-fx-background-color: BLACK;");

		Scene cena = new Scene(vboxLayout, 300, 150);

		palco.setTitle("Relógio Digital");
		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
