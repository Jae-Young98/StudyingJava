package JavaJungsuk.CH06;

import java.lang.reflect.Member;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv;     // 클래스변수는 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv); // 클래스메서드에서 인스턴스변수 사용불가.
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 인스턴스메서드에서는 인스턴스변수 바로 사용 가능.
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); // 클래스메서드에서는 인스턴스메서드 호출 불가.
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
