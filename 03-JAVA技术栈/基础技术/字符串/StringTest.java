public class StringTest {

    public static void main(String[] args) {
        /**
         * +会被优化为StringBuilder的append。
         */
        System.out.println(null + null); // nullnull
        System.out.println(null);   // 编译报错

    }

}