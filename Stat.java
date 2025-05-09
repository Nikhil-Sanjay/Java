
class Stat{
    static{
        System.out.println("Static block is called first");
    }
    {
        System.out.println("Next to static, empty block is called");
    }
    Sub(){
        System.out.println("Finnaly Constructor block is called");
    }
}
class Main {
    public static void main(String[] args) {
        new Sub();
    }
}
