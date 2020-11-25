package view;

import modell.PiValuerInterface;

import java.util.function.*;


public class MainFase2 {

    public static void main(String[] args) {
        PiValuerInterface piValue = () -> (3.1415);
        System.out.println(piValue.getPiValue());

    }
}
