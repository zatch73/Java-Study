package generics.test1;

public class Laranja implements Fruta{
    public String name;

    public Laranja(String name) {
        this.name = name;
    }

    @Override
    public void barulho(){
        System.out.println("1 - XAXAXA");
    }
}
