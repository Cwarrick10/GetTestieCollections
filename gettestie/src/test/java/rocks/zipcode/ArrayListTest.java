package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    private ArrayList<String> arrlist;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;

    @Before
    public void setUp(){
        this.arrlist = new ArrayList<>();
        person1 = new Person("Bob",1990);
        person2 = new Person("Mike",1996);
        person3 = new Person("Charles",2002);
        person4 = new Person("Mary",1989);

    }
    @Test
    public void arrayListTest1(){

//        Assert.assertEquals(4,arrlist.size());

    }
    @Test
    public void arrayListTestRemove(){
        arrlist.remove(person3);
        Assert.assertEquals(false,arrlist.contains(person3));
    }
}
