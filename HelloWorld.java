public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Wassup");
        ThisShouldWork.printMe();
    }
}

class ThisShouldWork {
    public static void printMe() {
        System.out.println("And so, I printed.");
    }
    
}

/*
 * You can put multiple classes within the same file.
 * As long as one of those classes has the same name as the file, it's fine,
 * even if every class has package access (no modifiers)
 * If a class needs to be public, all other classes in the same file must have package access.
 * If a class needs to be public, it must not only have the same name as the file,
 * but also must have the main method in it (to compile)
 * 
 * Method signatures
 */