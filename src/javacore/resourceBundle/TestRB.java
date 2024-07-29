package javacore.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestRB {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("responses", Locale.of("pt", "Br"));
        System.out.println(bundle.getString("already_exists"));
        System.out.println(bundle.getString("so_existe_no_default"));
    }
}
