package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + Constant.MAX_USER);
        int currentUsserCount = 999;
        process(currentUsserCount++);
        process(currentUsserCount++);
        process(currentUsserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > Constant.MAX_USER) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
