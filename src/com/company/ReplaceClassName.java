package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceClassName {
    String tx;
    public String ReplaceClassName(String tx){
            this.tx = tx;
            int i = 0;

            String[] newName = new String[]{"B", "C", "D", "E", "F", "G", "I", "J", "K",
                    "L", "O", "M", "N", "P", "Q", "R", "T", "U", "V", "W", "S", "Y", "X", "Z"};

            Pattern pattern = Pattern.compile("public class .+\\{");
            Matcher matcher = pattern.matcher(tx);
            tx = matcher.replaceAll("public class" + newName[i] + "{");



        return tx;
    }
}
