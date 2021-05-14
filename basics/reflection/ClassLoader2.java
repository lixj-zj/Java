package reflection;

/**
 * @Description: --------------------------------------
 * @ClassName: ClassLoader2.java
 * @Date: 2021/5/14 12:00
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 **/
public class ClassLoader2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

        /**
         * 1. 加载到内存,会产生一个类对应Class对象
         * 2. 链接,连接结束后m=0
         * 3. 初始化
         *  <clinit>(){
         *       System.out.println("A类静态代码块初始化");
         *       m = 300;
         *       m = 100;
         *  }
         */
    }
}

class A {
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }

    static int m = 100;

    public A() {
        System.out.println("A类无参构造初始化");
    }
}
