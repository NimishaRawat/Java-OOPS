abstract class pen1{
    abstract void write();
    abstract void refile();
}
class fountainPen extends pen1{
    // no need to make public
    void write(){

    }
    void refile(){

    }
    void changeNib(){

    }
}
public class pen {
    public static void main(String[] args) {
        fountainPen p = new fountainPen();
    }
}
