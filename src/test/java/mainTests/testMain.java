package mainTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.Main;

import java.util.Arrays;

public class testMain {

  @Test
  public void testSort(){
    int[] arr= {1,2,5,4};

    Arrays.sort(arr);
    Assert.assertEquals(arr, Main.arrSort(new int[] {1,2,5,4,}));

  }

}
