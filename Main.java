class StringUtils {

  public static boolean isNullOrEmpty (String toBeChecked){
    if(null == toBeChecked || toBeChecked.length() == 0){
      return true;      
    }
    return false;
  }

  public static boolean isBlank (String toBeChecked){
    if(StringUtils.isNullOrEmpty(toBeChecked)){
      return true;      
    }
    return toBeChecked.trim().length() == 0;
  }

}

class Main {
  public static String DEFAULT_NAME = "user";
  public static String DEFAULT_GREETING = "Hello";

  //String concatenation
  public static void printName(String name){
    if(!StringUtils.isBlank(name)){
      /* null check & empty check */
      System.out.println("@"+name);
    }else{
      System.out.println("@"+DEFAULT_NAME);
    }

  }

  //String concatenation
  public static void printWelcomeMessage(String name){
    if(!StringUtils.isBlank(name)){
      /* null check & empty check */
      System.out.println("Hello " +name+",");
    }else{
      // System.out.println("@"+DEFAULT_NAME);
      System.out.println("Hello,");
    }
  }

  //String concatenation
  // advanced use-case
  public static void printWelcomeMessage(String greetingText,
                                          String name){
    String txt = StringUtils.isBlank(greetingText)? DEFAULT_GREETING: greetingText;
    if(!StringUtils.isBlank(name)){
      /* null check & empty check */
      System.out.println(txt+ " " +name+",");
    }else{
      // System.out.println("@"+DEFAULT_NAME);
      System.out.println(txt+",");
    }
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Main.printName("Rajeev");
    Main.printName("");
    Main.printName(null);
    Main.printWelcomeMessage("");
    Main.printWelcomeMessage("Rajeev");
    Main.printWelcomeMessage("   ");
    System.out.println("Phase II");
    Main.printWelcomeMessage("", "");
    Main.printWelcomeMessage("Hi", "Rajeev");
    Main.printWelcomeMessage("Hola", "   ");

    System.out.println(calculate(4,5,'+'));
    System.out.println(calculate(12,4,'-'));
    System.out.println(calculate(13,3,'*'));
    System.out.println(calculate(13,3,'p'));
    System.out.println(calculate(13,3,'%'));

    System.out.println("Floated values");

    //Integers are defaulted to int Type
    System.out.println(calculateF(4,5,'+'));
    System.out.println(calculateF(12,4,'-'));
    System.out.println(calculateF(13,3,'*'));
    System.out.println(calculateF(13,3,'p'));
    System.out.println(calculateF(13,3,'/'));
  
    float f1 = new Float(13.3);
    float f2 = new Float(3.0);
    //Explicitly called on Float values
    System.out.println(calculateF(f1,f2,'/'));
    //Decimals are defaulted to Double Type
    System.out.println(calculateF(13.1,7.0,'/'));
  }

  public static int calculate(int a, int b, char op){
    int result = 0;
    switch(op){
      case '-':
       result = a-b;
       break;
      case '*':
       result = a*b;
       break;
      case '/':
       //returns quotient only
       result = a/b;
       break;
      case '%':
       //returns remainder only
       result = a%b;
       break;
      case '+':
      default: 
        //default case
        result = a+b;
      break;
    }
    return result;
  }

public static float calculateF(int ia, 
                      int ib, char op){
    float a = new Float(ia);
    float b = new Float(ib);
  return Main.calculateF(a,b,op);
}

public static float calculateF(double ia, 
                    double ib, char op){
    float a = new Float(ia);
    float b = new Float(ib);
  return Main.calculateF(a,b,op);
}
public static float calculateF(float a, 
                    float b, char op){
    float result = 0;
    switch(op){
      case '-':
       result = a-b;
       break;
      case '*':
       result = a*b;
       break;
      case '/':
       //returns quotient only
       result = a/b;
       break;
      case '%':
       //returns remainder only
       result = a%b;
       break;
      case '+':
      default: 
        //default case
        result = a+b;
      break;
    }
    return result;
  }
  
}