import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.paint.Color;
public class ProjetoCalculadoraIMC extends Application {
	
	@Override
	public void start(Stage palco) {
		Label etiquetaPeso = new Label("Peso");
		Label etiquetaAltura = new Label("Altura");
		TextField campoPeso = new TextField();
		campoPeso.setPromptText("Peso em kg");
		TextField campoAltura = new TextField();
		campoAltura.setPromptText("Altura em metros");
		Label etiquetaResultado = new Label();
		Button botaoCalcular = new Button("Calcular IMC");
		botaoCalcular.setOnAction(e -> {
			try {
				double peso = Double.parseDouble(campoPeso.getText().replace(',', '.'));
				double altura = Double.parseDouble(campoAltura.getText().replace(',', '.'));
				if (peso <= 0 || altura <= 0) {
					etiquetaResultado.setTextFill(Color.RED);
					etiquetaResultado.setText("Peso e altura devem ser maiores que zero.");
					return;
				}
				double imc = peso / (altura * altura);
				String classificacao = "";
				if (imc < 18.5) {
					classificacao = "Abaixo do peso";
				} else if (imc < 25) {
					classificacao = "Peso normal";
				} else if (imc < 30) {
					classificacao = "Sobrepeso";
				} else {
					classificacao = "Obesidade";
				}
				
				etiquetaResultado.setTextFill(Color.BLACK);
				etiquetaResultado.setText(String.format("Seu IMC é: %.2f, você está na classificação '%s'", imc, classificacao));
			} catch (NumberFormatException ex) {
				etiquetaResultado.setTextFill(Color.RED);
				etiquetaResultado.setText("Por favor, insira números válidos para peso e altura");
			}
		});
		VBox layout = new VBox(10, etiquetaPeso, campoPeso, etiquetaAltura, campoAltura, botaoCalcular, etiquetaResultado);
		layout.setPadding(new Insets(10));
		layout.setAlignment(Pos.CENTER);
		Scene cena = new Scene(layout, 400, 350);
		palco.setTitle("Calculadora de IMC");
		palco.setScene(cena);
		palco.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
