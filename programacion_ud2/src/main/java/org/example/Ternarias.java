package org.example;

public class Ternarias {
    static void main() {
//        int a = 2, b = 3, c = 4;
//
//       int resultado = c-- == 4 && a > b ? a += b :
//                a++ > 0 && c == b ? a += c :
//                        b == c ? a++ : a--;
//
//        System.out.println(resultado);

//        int a = 5;
//        int b = 8;
//        int c = 10;
//
//        int resultado = a++ == 6 && b-- == 8 ? c + a++ == 10 ? c-- : a++ : a + c++  ;


//        int y = 5;
//        int x = 2 * y;
//        int z = 1 + x;
//
//        int resultado = ++x == 11 && y > z ? y += z :
//                z++ == 12 ? z *= x :
//                        y * 5 >= ++z + 11 ? x + z : y * 10;

        int a = 1, b = 2, c = 3, resultado;

        resultado = ++a < c && a != b ? a -= b:
                c-- == b || --b == c ? b += c:
                        b <= a++ && a > c ? c + c: c--;
        System.out.println(resultado);
        System.out.println();



    }
}
