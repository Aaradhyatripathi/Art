  abstract class abst {
    abstract void start();
}
class car extends abst{
    void start(){
        System.out.println("car start with key");
    }
}
class bike extends abst{
    void start(){
        System.out.println("bike start with kick");
    }
    public static void main(String[] args){
        car c=new car();
        c.start();
        bike b=new bike();
        b.start();

    }
}
