package Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {//é uma interface

    public static void main(String[] args) throws IOException {
        //DosFileAttributes é mias voltada para o windows
        //PosixFileAttributes sistemas voltados para linux
        File file = new File("folder/novo.txt");
        LocalDateTime data = LocalDateTime.now().minusDays(10);
        boolean isCreate = file.createNewFile();
        boolean isModified = file.setLastModified(data.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("folder/novo_dois.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(data.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

    }


}
