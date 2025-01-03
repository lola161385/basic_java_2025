package week_1.w1_2_class_n_obj;

public class ClassRoom {
    // 정적 변수, Static 변수는 선언과 동시에 초기화를 해줍니다.
    // 클래스 변수라고도 부릅니다.
    static boolean hasDoor = true;

    // int roomNum = 410;  // 멤버변수 하드코딩 금지
    int roomNum;
    String roomName;

    // 객체가 생성될 때에 멤버변수도 함께 초기화
    public ClassRoom(int roomNum, String roomName) {
        // 기본 생성자
        this.roomNum = roomNum;
        System.out.println(this.roomNum + "번 강의장 객체가 생성되었습니다.");

        this.roomName = roomName;
    }

    // 일반 메서드
    public void printRoomName() {
        System.out.println(this.roomName);
    }

    public void printRoomNameNTimes(int n) {
        for (int i = 0; i < n ; i++){
            System.out.println(this.roomName);
        }
    }

    // 메서드
    public static void main(String[] args) {
        // 생성자의 호출로 객체가 만들어 집니다.
        ClassRoom classRoom410 = new ClassRoom(410, "KDT Room");
        ClassRoom classRoom411 = new ClassRoom(411, "Network Room");
        ClassRoom classRoom412 = new ClassRoom(412, "Community Room");

        classRoom410.printRoomName();
        classRoom411.printRoomName();
        classRoom412.printRoomName();

        System.out.println(ClassRoom.hasDoor);

        classRoom410.printRoomNameNTimes(10);
    }
}
