package practise04.oop3;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Miyav");
    }

    @Override
    public void meal() {
        System.out.println("Fish");
    }
}
