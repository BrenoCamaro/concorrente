package ucb.busca.servidores.testeAlgoritmos;

import java.util.regex.Pattern;

public interface SearchAlgorithm {
    Pattern PATTERN = Pattern.compile("\"(\\d{1,})\":\"");

    void buscaSubString(String text, String substring);

}
