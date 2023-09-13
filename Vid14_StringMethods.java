package com.tushar;

public class Vid14_StringMethods {
    /*
     * String methods operate on Java Strings, they can be used to find length of the string, convert to 
     * lowe case, etc
     * Strings are IMMUTABLE
     * 
     * name.length() = Returns length of String
     * name.toLowerCase()
     * name.toUpperCase()
     * name.trim()
     * name.substring()
     * name.replace(oldChar, newChar)
     * name.startsWith("Tu"); = return true
     * name.newWith("ar"); = return true
     * name.charAt(index); //a
     * name.indexOf('a'); //4
     * name.indexOf('a',5)
     * name.equals(nnmae);
     * name.equalsIgnoreCase(nnmae);
     */
    public static void main(String[] args) {
        /*String name = "TUSHAR";
        String a1 = new String("Tushar");
        int nameLength = name.length();
        System.out.println(name+" "+nameLength+" "+name.toLowerCase());*/

        /*String nonTrimmedString = "         Tushar            ";
        System.out.println(nonTrimmedString);//         Tushar            .
        System.out.println(nonTrimmedString.trim());*/

        /*String name = "Tusha__ar";
        String nmae = "tusha__ar";
        System.out.println(name.replace('T', 'H'));
        System.out.println(name.startsWith("Tu"));
        System.out.println(name.endsWith("ar"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a', 5));
        System.out.println(name.indexOf("a__a"));
        System.out.println(name.equals(nmae));
        System.out.println(name.equalsIgnoreCase(nmae));
        System.out.println(name.compareToIgnoreCase(nmae));*/

        //escapeSequence
        //System.out.println("I am escape sequence " double quotes"); //without escape sequence
        System.out.println("I am escape sequence \"double quotes\"");
    }
}
