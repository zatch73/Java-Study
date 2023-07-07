package generics.test1;

public class Goiaba implements Fruta{
    public String name;

    public Goiaba(String name) {
        this.name = name;
    }

    @Override
    public void barulho() {
        System.out.println("2 - GAGAGA");
    }
}
