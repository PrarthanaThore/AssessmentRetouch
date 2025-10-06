package Assessment_03;

public class Account {
    int id;
    String name;
    public Account(){
        id = 111;
        name = "dummy";
    }
    public void reset(){
//        this(); //<-- LINE A
//        Account(); //<-- LINE B
//        this = new Account(); //<-- LINE C
       // new Account(); //<-- LINE D
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.id = 2;
        a.name = "amy";
       // a.reset();
        System.out.println(a.id+", "+a.name);
    }
}

