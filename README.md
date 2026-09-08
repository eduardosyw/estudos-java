# Calculadora de IMC

Aplicação desktop simples com interface gráfica (JavaFX) para calcular o Índice de Massa Corporal (IMC).

## Funcionalidades

- Entrada de peso (kg) e altura (m)
- Cálculo do IMC
- Classificação: abaixo do peso, peso normal, sobrepeso ou obesidade
- Validação de campos (números inválidos ou valores negativos)

## Como rodar

Pré-requisitos: Java JDK e JavaFX SDK configurados.

```bash
javac --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls ProjetoCalculadoraIMC.java
java --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls ProjetoCalculadoraIMC
```

## Tecnologias

- Java
- JavaFX
