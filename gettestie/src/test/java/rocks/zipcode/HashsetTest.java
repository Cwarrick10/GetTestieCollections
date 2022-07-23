package rocks.zipcode;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import java.util.HashSet;

public class HashsetTest {
  private   HashSet<String> hSet;
@Before
    public void setUp() {
        this.hSet = new HashSet<String>();
        hSet.add("Bob");
        hSet.add("Charles");
        hSet.add("Mike");
        hSet.add("John");
    }
    @Test
    public void hashSetTest1(){

    Assert.assertEquals(4,hSet.size());
    }
    @Test

    public void hashSetTestRemove() {
    hSet.remove("Charles");
    Assert.assertEquals(3,hSet.size());
    Assert.assertEquals(false,hSet.contains("Charles"));
    }
@Test
    public void hashSetTestDuplicate(){
    hSet.add("Mike");
    hSet.add("Mike");
    hSet.add("Mike");
    hSet.add("Mike");
    String[] hSetToArr = hSet.toArray(new String[hSet.size()]);
    Assert.assertEquals(false, hSet.contains(hSetToArr));

}



}
