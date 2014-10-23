package testSomeGoods.project;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class SimpleSamples {
    
    boolean isBig(double q) {
        if (q>1e7) return true;
           return false; // если закомментировать - ошибка компиляции
    }
   // C:\project\rnu\iask-rnu\iask-rnu-form\iask-rnu-form-guarantee\iask-rnu-form-guarantee-web\src\main\java
//    \ru\sbrf\iask\rnu\form\guarantee\pack\client\tab\edit\views\mainterms\MainTermsView.ui.xml   
    void test() {
        // Объявляем переменные
        
        int x=127, y;
        //  y - не инициализированная переменная,
        // использовать её компилятор не даст
        //x=y; // => Ошибка компиляции 
        
        double фыва=77.7; // можно, но не нужно!
        
        String myFirstString="Hello!"; // соглашение об именах
               
        long l = 10000000000L;
        //l = 0xffffffffaaL;
        //l = 010; // 8
        System.out.println("l="+l);
        //l=0b10; // JDK 7 only
        
                
        boolean f;
        f = (x & 2) !=0; // 2-й 2-ичный разряд не равен 0
        System.out.println("f="+f);
        
        System.out.println("x="+Integer.toBinaryString(x));
        
        System.out.println("x+="+(1<<31));
        x+= 1<<31;
        
        System.out.println("x="+Integer.toBinaryString(x));
        System.out.println("x="+x);
        System.out.println("x>>1="+Integer.toBinaryString(x>>1));
        System.out.println("x>>1="+(x>>1));
        System.out.println("x>>>1="+Integer.toBinaryString(x>>>1));
        System.out.println("x>>>1="+(x>>>1));
        
        if ( (x>3) ^ (x<7) ) {
            // x>3 && x>=7        ||   x<=3 && x<7
        }
        
        byte b = 1;
        
        //b=x; // ошибка компиляции
        b=(byte) x; // 
        System.out.println("b="+Integer.toBinaryString(b));
        
        //b=b+1; // ошибка компиляции - b+1 имеет тип int!!!
        double w;
        System.out.println((w=-100.1 % 30)); // -10
        System.out.println("w="+w);
        System.out.println(w == -10.1);
        
        // BigDecimal
        BigInteger big = new BigInteger("1111111111111111111111111111111111111111111111111111");
        System.out.println(       big.multiply(big) );
        System.out.println(       big.multiply(big) );
        
        System.out.println("Integer.parseInt(\"752\")+3 = "+ (Integer.parseInt("752")+3)); // 755
        
        for (int i=1, j=2; i<10; i++, j+=2) {
            System.out.println(String.format("i=%5d j=%5d", i,j) );
        }
        
        y=0;
        System.out.println( "++:" +( y++ + ++y));
        System.out.println("y:"+y);
        
        a: {
            System.out.println("1");
            System.out.println("2");
            if (true) break a;
            System.out.println("3");
            System.out.println("4");
        }
        
        a: switch (5) {
            case 7:  System.out.println("7");
            case 5:  for (int i=0; i<7;i++) {
                        System.out.println("5"+i);
                        if (i==6) break; // 56
                        //if (i==6) break a; // 56 3
                    }
            case 3:  System.out.println("---3");
        }
        
        // Массивы
        int aa[],bb=2;
        System.out.println(bb);
        
        int[][][] xx= new int[][][] { {  {1,2},{3,4}  } , { {1},null } , {{1,2,3} }   };
        int[] q=new int[]{7,2,8};
        Arrays.sort(q);
        
        System.out.println("q.length="+ q.length);
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(xx[1])); // { {1},null }
        xx[1][1]=q;
        System.out.println(Arrays.toString(xx[1])); // { {1},null }
        
    }
    
    public static void main(String[] args) {
        new SimpleSamples().test();
    }
}
