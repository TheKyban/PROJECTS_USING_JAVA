class Animal {
    void Type() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Bow Bow");
    }
}

class lion extends Dog {
    void roar() {
        System.out.println("roaring");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        lion ll = new lion();
        ll.Type();
    }
    
}
