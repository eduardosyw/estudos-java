# projetos-basicos-java

Repositório para guardar projetos simples feitos durante o curso de Java.

## Estrutura de pastas (correta)

Cada projeto deve ficar em **sua própria subpasta**, na raiz do repositório:

```text
projetos-basicos-java/
├── README.md
├── .gitignore
├── calculadora-imc/
│   └── README.md
└── outro-projeto/
    └── README.md
```

## Tabela de projetos

> Sempre que criar um novo projeto, adicione uma nova linha nesta tabela.

| Projeto | Descrição | Status |
|---|---|---|
| [calculadora-imc](./calculadora-imc/) | Calcula o IMC com base em peso e altura | Em andamento |
| [outro-projeto](./outro-projeto/) | Descreva aqui o objetivo do projeto | Planejado |

## Como fazer o upload/commit inicial (passo a passo)

No terminal, dentro da pasta do repositório:

```bash
git init
git add .
git commit -m "feat: commit inicial dos projetos Java"
git branch -M main
git remote add origin https://github.com/SEU-USUARIO/projetos-basicos-java.git
git push -u origin main
```

Se o repositório no GitHub já existir e o `origin` já estiver configurado, pule a linha do `git remote add origin`.