package Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {//é uma interface

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder/novo_dois.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModified = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("CreationTime " + creationTime);
        System.out.println("LastModified " + lastModified);
        System.out.println("LastAcess " + lastModified);
        System.out.println("-----------");
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModified, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModified = fileAttributeView.readAttributes().lastModifiedTime() ;
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("CreationTime " + creationTime);
        System.out.println("LastModified " + lastModified);
        System.out.println("LastAcess " + lastModified);
        //tudo que tem view é utilizado para fazer alteracao
        // x

    }


}
