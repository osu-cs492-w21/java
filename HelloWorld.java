import java.time.LocalDateTime;

class HelloWorld {
  public static void main(String[] args) {
    boolean b = true;
    char c = 'c';
    byte by = 8;
    short sh = 16;
    int i = 32;
    long l = 64;
    float f = 32.0f;
    double d = 64.0;

    System.out.println("Hello, world!");

    int[] arr = new int[10];
    arr[0] = 0;
    // arr[1000] = 1000;
    for (int j = 0; j < arr.length; j++) {
      arr[j] = j * j;
    }

    int[] arr2 = arr;
    arr2[5] = 55555;

    System.out.println(arr);
    System.out.println(arr2);

    int[] arr3 = new int[arr.length];

    for (int elem : arr) {
      System.out.println(elem);
    }

    System.out.println("It is now: " + LocalDateTime.now());
  }
}
