package Xserilizacao.test;

import Xserilizacao.domain.Aluno;
import Xserilizacao.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SeralizacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Gustavo", "1234");
        Turma turma = new Turma("SENAI");
        aluno.setTurma(turma);
        serilizar(aluno);
        deserilizar();
    }

    private static void serilizar(Aluno aluno) {
        //trabalha em baixo nivel
        Path path = Paths.get("pasta/alunos.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserilizar() {
        //trabalha em baixo nivel
        Path path = Paths.get("pasta/alunos.ser");
        try (ObjectInputStream oip = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) oip.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
