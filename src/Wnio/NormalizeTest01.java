package Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/gustavo/dev";
        String arquivoTXT = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTXT);
        System.out.println(path1);
        System.out.println(path1.normalize());
    }
}
