
import com.mycompany.minimum.length.sub.array.Solution;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public class TestSolution {

    @Test
    public void test1() {
        Character[] A = new Character[]{'a', 't', 'f', 's', 'c', 'b', 's', 'a', 'c', 'b'};
        Character[] S = new Character[]{'a', 'b', 'c'};
        Assert.assertEquals(3, Solution.minimumLength(A, S));

    }

    @Test
    public void test2() {
        Character[] A = new Character[]{'a', 't', 'f', 's', 'c', 'b', 's', 'a', 'c', 'b'};
        Character[] S = new Character[]{'f', 's', 'b'};
        Assert.assertEquals(4, Solution.minimumLength(A, S));

    }

    @Test
    public void test3() {
        Character[] A = new Character[]{'a', 't', 'f', 's', 'c', 'b', 's', 'a', 'c', 'b'};
        Character[] S = new Character[]{'a', 't', 'b'};
        Assert.assertEquals(6, Solution.minimumLength(A, S));

    }
    
    @Test
    public void test4() {
        Character[] A = new Character[]{'a', 't', 'f', 's', 'c', 'b', 's', 'a', 's', 'b'};
        Character[] S = new Character[]{'a', 'b', 'c'};
        Assert.assertEquals(4, Solution.minimumLength(A, S));

    }

}
