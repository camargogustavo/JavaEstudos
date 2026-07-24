package Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean mkdir = fileDiretorio.mkdir();
        System.out.println(mkdir);
        File arquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = arquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);
        File fileRename = new File(fileDiretorio,"gustavinho.txt");
        boolean isRenameFile = arquivoDiretorio.renameTo(fileRename);
        System.out.println(isRenameFile);

        File renameDiretorio = new File("pasta2");
        boolean isrenameDiretorio = fileDiretorio.renameTo(renameDiretorio);
        System.out.println(isrenameDiretorio );

    }
}
