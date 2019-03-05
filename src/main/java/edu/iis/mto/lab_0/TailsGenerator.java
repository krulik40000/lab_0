package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        int i;
        List<String> lista = new ArrayList<String>();
        if (value == null) {
            return Collections.emptyList();
        }
        for (i = 0; i < value.length(); i++) {
            lista.add(value.substring(i, value.length()));
        }
        lista.add("");
        return lista;

    }

}
