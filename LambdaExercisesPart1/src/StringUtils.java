
import java.util.Arrays;

public class StringUtils {
    
    

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();
    }
    
    private static void ex4() {
        String longer = betterElement("aaaknskfb", "sjdfkjbfb", (arg1,arg2)->arg1.length() > arg2.length());
        
        System.out.println("Longer word is "+longer);
        Integer greater = betterElement(10, 20, (i1,i2)-> i1>i2);
        System.out.println("Greater number is: "+greater);
    }
    
    public static <T> T betterElement(T first,T second,TwoElementPredicate<T> condition) {
        if(condition.isFirstBetter(first, second)) {
            return first;
        }else {
            return second;
        }
    }

    private static void ex3() {
        String longer = betterString("aaaknskfb", "sjdfkjbfb", (arg1,arg2)->arg1.length() > arg2.length());
        System.out.println("Longer word is "+longer);
        
    }
    
    public static String betterString(String first,String second,TwoStringPredicate condition) {
        if(condition.isFirstBetter(first, second)) {
            return first;
        }else {
            return second;
        }
    }

    public int eChecker(String s1,String s2) {
        if(s1.contains("e") && !s2.contains("e")) {
            return -1;
        }else if(s2.contains("e") && !s1.contains("e")) {
            return 1;
        }else {
            return 0;
        }
    }

    private static void ex2() {
        StringUtils u = new StringUtils();
        String[] strings = {"error","this","is","an","array","which","has","words","like","xylophone"};
        Arrays.sort(strings,u::eChecker);
        System.out.println(Arrays.asList(strings));
    }

    private static void ex1() {
        String[] strings = {"error","this","is","an","array","which","has","words","like","xylophone"};
        Arrays.sort(strings,(o1, o2)->o1.length() - o2.length());
        Arrays.sort(strings,(o1, o2)->o2.length() - o1.length());
        Arrays.sort(strings,(s1,s2) -> {
            if(s1.contains("e") && !s2.contains("e")) {
                return -1;
            }else if(s2.contains("e") && !s1.contains("e")) {
                return 1;
            }else {
                return 0;
            }
        });
        System.out.println(Arrays.asList(strings));
    }

}

