package week_3.w3_7_travelsystem;

public class Nation {
    // 입국 심사를 수행하는 기준이나
    // 심사를 받을 때 제출할 기준도 필드(인스턴스 변수)로 선언 필요
    // 전시상태 여부
    // 정치체제
    // 국가 신용등급
    private String nationName;
    private String nationalSystem;

    public Nation(String nationName, String nationalSystem) {
        this.nationName = nationName;
        this.nationalSystem = nationalSystem;

    }

    // 입국 심사
    public boolean screenImmigration(
            // 여행자, 이민자 등 정보 수신 필요
            // 개인 정보만 들어오면 될 수도 있고
            // 국적에 해당하는 객체 참조 필요할 수도 있음
            // 파라미터 개수와 관계 없이 데이터 접근만 가능하면 됨
            Citizen screenTgPerson
    ) {
        // 심사 기준 TBD
        // 조건문 검사 수행
        return true;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "nationName='" + nationName + '\'' +
                ", nationalSystem='" + nationalSystem + '\'' +
                '}';
    }
}
