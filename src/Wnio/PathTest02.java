package Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");//New file pasta
        if (Files.exists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path criarSubpastas = Files.createDirectories(subPastaPath);
        Path filepath = Paths.get(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filepath)) {
            Path filePathCreate = Files.createFile(filepath);
        }

        Path source = filepath;
        Path target = Paths.get(filepath.getParent().toString(), "renamed_file.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
