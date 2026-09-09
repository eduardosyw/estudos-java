import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ProjetoGeradorDeSenhasGUI extends Application {

	@Override
	public void start(Stage palco) {

		palco.setTitle("Gerador de Senhas");

	Label labelTamanhoSenha = new Label("Tamanho da senha: ");
	TextField campoTamanhoSenha = new TextField();
	campoTamanhoSenha.setText("10"); // sugestão de tamanho da senha que vai ser gerada

	Label labelSenhaGerada = new Label("Senha gerada: ");
	TextField campoSenhaGerada = new TextField();
	campoSenhaGerada.setEditable(false); // deixando o setEditable como false para que o usuário não consiga mexer na senha depois da senha ter sido gerada

	Label labelErro = new Label();

	Button botaoGerar = new Button("GERAR SENHA");
	botaoGerar.setOnAction(e -> {
		try {
			int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText());

			if (tamanhoSenha < 5) {
				labelErro.setTextFill(Color.RED);
				labelErro.setText("ERRO: A SENHA DEVE TER NO MÍNIMO 5 CARACTERES");
				campoSenhaGerada.clear();
				return;
			}

			labelErro.setText("");
			String senha = ProjetoGeradorDeSenhas.gerarSenha(tamanhoSenha);
			campoSenhaGerada.setText(senha);

		} catch (NumberFormatException ex) {
			labelErro.setTextFill(Color.RED);
			labelErro.setText("ERRO: DIGITE APENAS NÚMEROS INTEIROS.");
			campoSenhaGerada.clear();
		}
	});

	VBox vBox = new VBox(labelTamanhoSenha, campoTamanhoSenha, botaoGerar, labelErro, labelSenhaGerada, campoSenhaGerada);
	vBox.setSpacing(10);
	vBox.setPadding(new Insets(10));

	Scene cena = new Scene(vBox, 350, 300);
	palco.setScene(cena);
	palco.show();
}

	public static void main(String[] args) {
		launch(args);
	}
}
