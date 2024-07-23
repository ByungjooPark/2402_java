package Edu;

public class EduClassExtends {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printInfo();
    }
}

class Mammal {
    String Kinds;
    protected String name;

    public Mammal() {
        this.Kinds = "포유류";
    }

    public void printInfo() {
        System.out.println("Kinds: " + this.Kinds);
    }
}

class Whale extends Mammal {
    public Whale() {
        super();
        this.name = "고래";
//        System.out.println("Whale");
        System.out.println(this.Kinds.concat(this.name));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Name: " + this.name);
    }
}