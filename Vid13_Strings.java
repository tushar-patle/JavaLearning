package com.tushar;

public class Vid13_Strings {
    /*
     * A String is a sequence of characters
     * Strings are immutable and cannot be changed
     */
    public static void main(String[] args) {
        String name;
        name = "Tushar";
        System.out.println(name);


        String name1;
        name1 = new String("Tushar1");
        System.out.println(name1);

        String name2 = "Tushar2";
        System.out.println(name2);


        int a=4;
        float b=4.6f;
        char c = 'A';
        //print using format specfier
        System.out.printf("a=%d, b=%.2f, c=%c, name=%s", a,b,c,name);
    }
}
