package U1T8;

class LetterRunner {
    public static void main(String[] args) {
        Letter sachin = new Letter("Sachin");
        sachin.writeLetter("sachin");
    }
}


public class Letter {
    // instance variables
    /* none yet */
    private String name;
    // constructor; since there are no instance variables to initialize,
    // this constructor has no parameters and has an empty body: { }
    public Letter(String n) { 
        name = n;
    }
    
    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
        signoff();
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }

    public void signoff() {
        System.out.println("From, " + name);
    }
}
