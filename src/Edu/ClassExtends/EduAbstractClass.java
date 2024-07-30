package Edu.ClassExtends;

import java.util.ArrayList;

public class EduAbstractClass {
    public static void main(String[] args) {
//        Whale whale = new Whale();
//        System.out.println(whale.birth());
//
//        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
//        System.out.println(flyingSquirrel.residence());

//        다형성
//        Mammal whale = new Whale();
//        System.out.println(whale.birth());
//        whale.test(); // 오버라이딩한 자식의 메소드가 실행


        // 업캐스팅
        Mammal mammal;
        Whale whale = new Whale();
        mammal = (Mammal)whale;
        System.out.println(mammal.birth());

        Mammal[] arr = new Mammal[2];
        arr[0] = new Whale();
        arr[1] = new FlyingSquirrel();

        // 다운 캐스팅
        Whale whale2 = (Whale)arr[0];
        System.out.println(whale2.swimming());

        // 타입 다형성
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        ArrayList<Mammal> mammals = new ArrayList<>();
        mammals.add(whale);
        mammals.add(flyingSquirrel);

        // 파라미터의 다형성
        PrintTest printTest = new PrintTest();
        printTest.instancePrint(whale);
        printTest.instancePrint(flyingSquirrel);
    }
}
interface Swimm {
    public String swimming();
}

class PrintTest {
    final public void instancePrint(Mammal mammal) {
        System.out.println(mammal.toString());
    }

//    final public void instancePrint(FlyingSquirrel flyingSquirrel) {
//        System.out.println(flyingSquirrel.toString());
//    }
}

abstract class Mammal {
    protected String name;

    public Mammal(String name) {
        this.name = name;
    }

    final public String birth() {
        return this.name + " 출산합니다.";
    }

    abstract public String residence();

    public void test() {
        System.out.println("부모 테스트");
    }
}

class Whale extends Mammal implements Swimm {
    public Whale() {
        super("고래");
    }

    public String residence() {
        return this.name + " 바다에 삽니다.";
    }

    public String swimming() {
        return this.name + "헤엄칩니다.";
    }

    public void test() {
        System.out.println("자식 테스트");
    }
}

class FlyingSquirrel extends Mammal {
    public FlyingSquirrel() {
        super("날다람쥐");
    }

    public String residence() {
        return this.name + " 산에 삽니다.";
    }
}

class FlyingFish implements Swimm {
    protected String name;

    public FlyingFish() {
        this.name = "날치";
    }

    public String swimming() {
        return this.name + " 헤엄칩니다.";
    }
}