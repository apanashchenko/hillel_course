package trash.lec_14;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) throws Exception {
        String name = null;
        try{
            int a = 10/0;
            System.out.println("Name: " + name.toString());
        }
        catch (NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("Done");

        if(name == null){
        throw new Exception("name is " + name);
        }

        int a = 10;
        if(a == 5){}
        else {
        throw new AssertionError();
        }
    }
}
