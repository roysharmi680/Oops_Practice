public class Demo {

    static int staticVar = 100;
    int nonStaticVar = 200;

    static void staticMethod() {
        System.out.println("Inside static method");
        System.out.println("Static variable = " + staticVar);
        //nonStaticMethod(); // cant call non static method from static method
        // System.out.println("Non-static variable = " + nonStaticVar);  // cant call non static variable from static method
         }
    void nonStaticMethod() {
        System.out.println("Inside non-static method");
        System.out.println("Static variable = " + staticVar);
        System.out.println("Non-static variable = " + nonStaticVar);
        staticMethod();
        
    }
    static {
        System.out.println("hello from static block");
    }
    static {
        System.out.println("hello from static block2");
    } 
    // static block execute at the beging of the program and we can have many static block
    public static void main(String[] args) {

        System.out.println("Static variable = " + staticVar);
        staticMethod();
        Demo obj = new Demo();
        obj.nonStaticMethod();
        System.out.println("Non-static variable = " + obj.nonStaticVar);
        System.out.println("Static variable using object = " + obj.staticVar);
        obj.staticMethod();
        System.out.println("Static variable using class  = " + Demo.staticVar);
        Demo.staticMethod();
        obj.staticVar= 230;
        System.out.println("after modification of static variable");
        System.out.println("Static variable using class  = " + Demo.staticVar);
        System.out.println("Static variable using object = " + obj.staticVar);       
        //System.out.println("Static variable using class  = " + Demo.nonStaticVar); // cant call nonstatic var with class reference
        Demo obj2 = new Demo();
        System.out.println("Non-static variable from obj2 = " + obj2.nonStaticVar);
        obj.nonStaticVar = 500;
        System.out.println("Non-static variable from obj = " + obj.nonStaticVar);
        System.out.println("Non-static variable from obj2 = " + obj2.nonStaticVar);

    }
}