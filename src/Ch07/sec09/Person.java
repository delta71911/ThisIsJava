package Ch07.sec09;

import org.w3c.dom.ls.LSOutput;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
    public void walk() {
        System.out.println("걷습니다.");
    }
}
