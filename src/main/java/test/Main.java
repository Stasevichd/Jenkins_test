package test;

import static java.util.Arrays.sort;

public class Main {
  public static void main(String[] args) {
    outputTest();
    System.out.println(arrSort(new int[]{1, 5, 3, 4}));
  }

  public static int[] arrSort(int[] arr) {
    sort(arr);
    return arr;
  }

  public static void outputTest() {

    System.out.println("CI/CD learning");
  }
}
