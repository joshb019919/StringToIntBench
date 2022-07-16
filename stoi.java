class Main {
  private static char[] STOA(String s) {
    return s.toCharArray();
  }

  private static int ATOI(char[] c) {
    boolean neg = false;
    int retVal = 0;
    int i = 0;
    
    if (c[0] == '-') {
      neg = true;
      i = 1;
    }

    for (; i < c.length; ++i) {
      retVal += (c[i] - 48) * Math.pow(10, c.length - 1 - i);
    }

    if (neg == true) {
      retVal = -retVal;
    }

    return retVal;
  }

  private static void tester() {
    String str = "123";
    String negStr = "-123";
    // System.out.println(ATOI(STOA(str)));
    // System.out.println(ATOI(STOA(negStr)));

    final long startTime = System.currentTimeMillis();
    for (int i = 0; i < 1000000; ++i) {
      ATOI(STOA(str));
      ATOI(STOA(negStr));
    }
    final long endTime = System.currentTimeMillis();
    System.out.println("Total execution time: " + (endTime - startTime));
    
    final long startTime2 = System.currentTimeMillis();
    for (int i = 0; i < 1000000; ++i) {
      Integer.parseInt(str);
      Integer.parseInt(negStr);
    }
    final long endTime2 = System.currentTimeMillis();
    System.out.println("Total execution time: " + (endTime2 - startTime2));
  }
  
  public static void main(String[] args) {
    for (int i = 0; i < 20; ++i) {
      tester();
    }
  }
}
