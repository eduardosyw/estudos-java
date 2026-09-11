# Editor de Texto Básico

Editor de texto simples com interface gráfica (JavaFX), com área de digitação livre e opção de salvar o conteúdo em um arquivo `.txt` no computador.

## Funcionalidades

- Área de texto livre para digitação
- Botão "Salvar" que abre uma janela do sistema (`FileChooser`) para escolher onde salvar o arquivo
- Gravação do conteúdo digitado em arquivo de texto usando `PrintWriter`

## Como rodar

Pré-requisitos: Java JDK e JavaFX SDK configurados.

```bash
javac --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls ProjetoEditorDeTexto.java
java --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls ProjetoEditorDeTexto
```

## Tecnologias

- Java
- JavaFX
- `java.io` (File, PrintWriter)
