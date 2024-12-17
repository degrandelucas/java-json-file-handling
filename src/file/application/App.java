package file.application;/* 1- Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.
2 - Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
3 - Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante. Utilize o metodo setPrettyPrinting para alcançar esse resultado.
4 - Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.*/

import com.google.gson.Gson;
import file.models.Titulo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        // 1 - Exercicio
        /*FileWriter file = new FileWriter("arquivo.txt");
        file.write("Conteúdo a ser gravado no arquivo!");
        file.close();*/

        // 2 - Exercicio
        Titulo titulo1 = new Titulo("Operação Natal", "Comedia", 2024);
        Titulo titulo2 = new Titulo("O Pior Vizinho do Mundo", "Drama", 2022);

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);

        String json = titulos

    }
}