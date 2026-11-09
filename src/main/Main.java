package main;

import utils.Input;

public class Main {

    public static void main(String[] args) {

        Series serie1 = new Series("Mentalista", "Netflix");
        Series serie2 = new Series(Input.st("Informe o nome da serie: "));

        System.out.println(serie1.toString());
        System.out.println(serie2.toString());

    }

    }