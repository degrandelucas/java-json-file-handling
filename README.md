# Projeto de Estudo - Manipulação de Arquivos, Serialização e JSON em Java

Este projeto explora conceitos fundamentais de manipulação de arquivos, serialização de objetos e formatação de JSON em Java. Utiliza as bibliotecas do pacote `java.io` e a biblioteca externa **Gson** para serializar objetos de classes customizadas.

---

## Funcionalidades Principais

1. **Gravação de Mensagens em Arquivos de Texto:**
   - Escreve uma mensagem específica em um arquivo chamado `arquivo.txt` usando a classe `FileWriter`.

2. **Serialização de Objetos em JSON:**
   - Converte objetos da classe `Titulo` e `Cars` em formato JSON utilizando a biblioteca **Gson**.

3. **Formatação Elegante de JSON:**
   - Aplica o método `setPrettyPrinting` da biblioteca **Gson** para gerar JSON formatado de maneira legível.

4. **Manipulação de Arquivos com JSON:**
   - Salva a saída JSON formatada em arquivos para facilitar o armazenamento e consulta.

---

## Estrutura do Código

### Classes e Suas Responsabilidades

- **`App`**  
  Classe principal que executa os seguintes processos:
  - Gravação de mensagens em um arquivo.
  - Instanciação de objetos das classes `Titulo` e `Cars`.
  - Serialização de listas de objetos para JSON formatado.
  - Salvamento do JSON em arquivos.

- **`JasonGeral`**  
  Classe responsável por centralizar a lógica de conversão de listas de objetos em JSON utilizando a biblioteca **Gson**.  
  - Utiliza `GsonBuilder` para aplicar a formatação elegante.

- **`Cars`**  
  Classe que representa um veículo com os atributos:
  - `name`: Nome do veículo.
  - `year`: Ano de fabricação.  
  Implementa o método `toString` para exibir uma representação amigável.

- **`Titulo`**  
  Classe que representa um título de filme com os atributos:
  - `movie`: Nome do filme.
  - `genero`: Gênero do filme.
  - `anoLancamento`: Ano de lançamento.  
  Implementa o método `toString` para exibir uma representação amigável.

---

## Como Executar o Projeto

1. **Clone o repositório.**

2. **Configure o ambiente Java.**
   - Certifique-se de ter o **Java 11 ou superior** instalado.
   - Faça o download da biblioteca **Gson** e adicione ao classpath.

3. **Compile os arquivos do projeto.**
   - Compile os arquivos `.java`:
     ```bash
     javac -cp gson-<version>.jar file/**/*.java
     ```

4. **Execute o projeto.**
   - Execute o programa principal:
     ```bash
     java -cp gson-<version>.jar:. file.application.App
     ```

5. **Resultados Esperados:**
   - Arquivo `arquivo.txt` com a mensagem: `Conteúdo a ser gravado no arquivo!`
   - Saída JSON formatada exibida no console.
   - Arquivo `arquivoCars.xml` com o JSON dos veículos.

---

## Tecnologias Utilizadas

- **Java 11 ou superior:** Para a lógica de programação.
- **Gson:** Biblioteca para conversão de objetos em JSON.
- **FileWriter:** Para manipulação de arquivos.

---

## Estrutura de Pastas
 ```bash
src/  
├── file/  
│   ├── application/  
│   │   └── App.java  
│   ├── connection/  
│   │   └── JasonGeral.java  
│   └── models/  
│       ├── Cars.java  
│       └── Titulo.java  
 ```
---
## Autor

Lucas Degrande
