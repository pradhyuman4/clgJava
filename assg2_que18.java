interface I1 {
    void m1();
    void m2();
}

interface I2 {
    void m3();
    void m4();
}

interface I3 {
    void m5();
    void m6();
}

interface CombinedInterface extends I1, I2, I3 {
    void m7(); // New method
}

class baseClass {
    void baseMethod() {
        System.out.println("Base class method called.");
    }
}


class MyClass extends baseClass implements CombinedInterface {

    @Override
    public void m1() {
        System.out.println("Method1 from Interface1");
    }

    @Override
    public void m2() {
        System.out.println("Method2 from Interface1");
    }

    @Override
    public void m3() {
        System.out.println("Method3 from Interface2");
    }

    @Override
    public void m4() {
        System.out.println("Method4 from Interface2");
    }

    // Implementing methods from Interface3
    @Override
    public void m5() {
        System.out.println("Method5 from Interface3");
    }

    @Override
    public void m6() {
        System.out.println("Method6 from Interface3");
    }

    @Override
    public void m7() {
        System.out.println("Method7 from CombinedInterface");
    }
}

class InterfaceMethods {
    public void processInterface1(I1 obj) {
        obj.m1();
        obj.m2();
    }

    public void processInterface2(I2 obj) {
        obj.m3();
        obj.m4();
    }

    public void processInterface3(I3 obj) {
        obj.m5();
        obj.m6();
    }


    public void processCombinedInterface(CombinedInterface obj) {
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();
        obj.m6();
        obj.m7();
    }
}



public class assg2_que18 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(); // Create an instance of MyClass
        InterfaceMethods interfaceMethods = new InterfaceMethods(); // Create instance of InterfaceMethods

        // Pass MyClass object to the methods
        interfaceMethods.processInterface1(myClass);
        interfaceMethods.processInterface2(myClass);
        interfaceMethods.processInterface3(myClass);
        interfaceMethods.processCombinedInterface(myClass);
    }
}
