package view;

import modell.ReverseInterface;

public class MainFase3 {

    public static void main(String[] args) {
        ReverseInterface reverseString = MainFase3::reverse;
        System.out.println("Let's try to reverse the magic word 'abracadabra!.");
        System.out.println("And.... "+ reverseString.reverse("Abracadabra!") +".");
    }

    private static String reverse(String string) {
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }

}

/*
Crea una Functional Interface que continga un mètode abstracte reverse (),
que retorne un valor String; en una altra classe, injecta a la interfície creada mitjançant
una lambda el cos del mètode, de manera que torne la mateixa cadena que rep com a paràmetre
però a l'inrevés. Invoca la instància de la interfície passant-li una cadena i comprovant el resultat.
 */