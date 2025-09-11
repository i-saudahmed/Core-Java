package interfacess.part1;

// class Computer {
//     public void code() {
//     }
// }

// abstract class Computer {
//     public abstract void code();
// }

interface Computer {
    void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : faster ");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run ");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class interface_Need {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer saud = new Developer();
        saud.devApp(lap);
    }
}
