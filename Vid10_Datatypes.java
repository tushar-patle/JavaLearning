package com.tushar;

public class Vid10_Datatypes {
    /*
     * Resulting datatype after arithmetic operation
     * byte + short = int
     * short + int = int
     * char + int = int
     * char + short = int
     * long + float = float;
     * int + float = float
     * long + double = double
     * float + double = double
     */
    public static void main(String[] args) {
        int a = 2;
        byte b = 4;
        short c = 3;
        char d = '5';
        double e = 7.5;
        float f = 7.5f;
        long g = 67;

        System.out.println(((Object)(b+c)).getClass().getSimpleName());
        System.out.println(((Object)(a+c)).getClass().getSimpleName());
        System.out.println(((Object)(a+d)).getClass().getSimpleName());
        System.out.println(((Object)(d+c)).getClass().getSimpleName());
        System.out.println(((Object)(g+f)).getClass().getSimpleName());
        System.out.println(((Object)(a+f)).getClass().getSimpleName());
        System.out.println(((Object)(g+e)).getClass().getSimpleName());
        System.out.println(((Object)(f+e)).getClass().getSimpleName());
    }
}
