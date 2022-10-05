package top.horon.exception;

public class Test {

    public static void main(String[] args) {
        new Test().test(1, 0);
        int a = 1;
        int b = 0;
        /*try {//try监控区域
            if (b = 0){
                throw new ArithmeticException();//主动抛出异常
            }
            System.out.println(a/b);
       // }catch (ArithmeticException e){//补货异常
            //System.out.println("程序出现异常，变量b不能为零");
        }catch (Error e){
            System.out.println("Error");
        }catch (Exception e){
            System.out.println("Exception");
        }
        catch (Throwable e){
            System.out.println("Throwable");
        }
        finally {//善后工作
            System.out.println("finally");
        }
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
    */
    }
    public void test(int a,int b){
            if (b == 0){
                throw new ArithmeticException();//主动抛出异常，一般在方法中使用
            }
    }
}
