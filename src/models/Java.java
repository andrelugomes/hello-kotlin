package models;

import org.jetbrains.annotations.NotNull;

public class Java implements Language {

    public final static String CONSTANTE = "constante";

    @NotNull
    @Override
    public String getName() {
        return "Java";
    }
}
