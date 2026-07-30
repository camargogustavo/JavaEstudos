package Ycolecoes.test;

import Ycolecoes.domain.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ABC1","IPhone");
        SmartPhone s2 = new SmartPhone("1ABC1","IPhone");

        System.out.println(s1.equals(s2));
        //true mesmo estando em difernetes objetos em memoria
    }
}
