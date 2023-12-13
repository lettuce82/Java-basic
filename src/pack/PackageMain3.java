package pack;

import pack.a.User; //clss 이름이 같은 경우에는 import는 한 클래스만 가능

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
