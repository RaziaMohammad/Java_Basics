class ConstructorDemo {
        int num1;
        int num2;
        float num3;int num4;int num5;
        public ConstructorDemo()
        {
            num1 =5;   //constructor
            num2 =6;
        }
        public ConstructorDemo(int n,double d)      //parameterised constructor
        {
            num3 = (float) d;
            num4 =n;

        }
        public static void main (String[] args)
        {
            ConstructorDemo obj1 =new ConstructorDemo();  //constructor
            ConstructorDemo obj2 =new ConstructorDemo(89,2.5);  //parameterised constructor
            System.out.println("Default constructutor");
            System.out.println(obj1.num1);
            System.out.println(obj1.num2);
            System.out.println("Parameterized constructutor");
            System.out.println(obj2.num3);
            System.out.println(obj2.num4);
        }

    }

