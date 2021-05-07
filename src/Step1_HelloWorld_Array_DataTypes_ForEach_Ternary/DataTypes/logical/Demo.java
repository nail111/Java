package Step1_HelloWorld_Array_DataTypes_ForEach_Ternary.DataTypes.logical;

class Demo {
    public static void main(String[] args) {
        // 1
        System.out.println("1: ");
        int a = 5;
        int result = ++a - --a-a++ - a--;
        // Сначала а увеличивается на 1.     а = 6
        // Далее 6 - --6 => 6 - 5 = 1        а = 5
        // 1 - 5++ = -4                      a = 6
        // -4 - 6-- = -10                    a = 5
        System.out.println("result = "+result);
        System.out.println("a = "+a);

        // 2
        System.out.println("2: ");
        boolean b = 5<3 && 5==5;
        System.out.println(b);
        b = 5==5 && 4<3;
        System.out.println(b);
        b= 5<3 || 5==5;
        System.out.println(b);
        // 3
        System.out.println("3: ");
        int c = 3;
        b = 5>4 && ++c>5;
        System.out.println(b); // c = 4
        b = 5>4 || ++c>5;
        System.out.println("c = " + c); // c  не увеличивается из-за ||, если было только |, то он бы увиличивался.
        b = 5>4 | ++c>5;
        System.out.println("c = " + c); // щас с увиличивается из-за |.
        // Если до знака  || всё тру, то дальше не проверяется.
        // Если до знака  | всё тру, то всё что стоит после знака тоже проверяется.
    }
}
