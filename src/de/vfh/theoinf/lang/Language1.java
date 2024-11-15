package de.vfh.theoinf.lang;

public class Language1 {
    /**
     * accept words over {a,b,c} that have b after every a.
     * @param word Eingabewort
     * @return true, wenn es ein Wort über {a,b,c} ist
     * und hinter jedem a direkt ein b folgt.
     */
    public static boolean accept(String word) {
        return word.matches("^(a?b|c)*$");
    }
}
