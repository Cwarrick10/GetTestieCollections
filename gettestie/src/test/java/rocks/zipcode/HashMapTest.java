package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;


public class HashMapTest {
    private HashMap<Integer,Person> hMap;
    private Person person1;
    private Person person2;
    private Person person3;


    @Before
    public void setUp(){
        this.hMap = new HashMap<Integer,Person>();
        person1 = new Person("Bob",1990);
        hMap.put(person1.getYearOfBirth(),person1);
        person2 = new Person("Mary",1988);
        hMap.put(person2.getYearOfBirth(), person2);
        person3 = new Person("Charles", 1995);
        hMap.put(person3.getYearOfBirth(), person3);

    }
    @Test
    public void HashMapTest(){
        Assert.assertEquals(false, hMap.isEmpty());
    }
    @Test
    public void HashMapTest1(){
        Assert.assertEquals(person3,hMap.get(1995));
    }


}
