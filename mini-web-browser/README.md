# Mini Web Browser

Navegador de internet básico com interface gráfica (JavaFX), capaz de carregar páginas web reais, navegar pelo histórico e recarregar a página atual.

![Mini Web Browser em funcionamento](./screenshot.png)

## Funcionalidades

- Carregamento de páginas web a partir de uma URL digitada (usando `WebView`/`WebEngine`)
- Formatação automática da URL, adicionando `https://` quando não informado
- Botões de "Voltar" e "Avançar" com base no histórico de navegação (`WebHistory`)
- Botão de recarregar a página atual

## Como rodar

Pré-requisitos: Java JDK e JavaFX SDK configurados (o módulo `javafx.web` é necessário).

```bash
javac --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.web ProjetoMiniWebBrowser.java
java --module-path /caminho/para/javafx-sdk/lib --add-modules javafx.controls,javafx.web ProjetoMiniWebBrowser
```

## Tecnologias

- Java
- JavaFX (`WebView`, `WebEngine`, `WebHistory`)
  
