package week_3.w3_7_travelsystem;

public class Citizen {

    String personName;  //이름
    Nation nationality; //국적
    int gender; // 1,3: 남성, 2,4: 여성 (%2연산으로 처리 예정)
    boolean hasPassport;    //여권보유여부
    boolean hasDoneMillitary;   // 군복무여부
    boolean hasCrimeRecord; // 전과기록

    public Citizen(String personName, Nation nationality, int gender, boolean hasPassport,boolean hasDoneMillitary, boolean hasCrimeRecord){
        this.personName = personName;
        this.nationality = nationality;
        this.gender = gender;
        this.hasPassport = hasPassport;
        this.hasDoneMillitary = hasDoneMillitary;
        this.hasCrimeRecord = hasCrimeRecord;
    }

    public void travel(Nation tgNation) {
        // 여행 대상국에서 검사 통과/차단 케이스에 따라서
        // 시민의 상태 변화 및 출력을 구현
        boolean screenPassed = tgNation.screenImmigration(
                this
                // 또는
                // this.특정정보1, this.특정정보2
        );
        if (screenPassed) {
            System.out.println("대상 국가 입국 성공");
        }
    }

    public void emigration(Nation tgNation) {
        // 이민 대상국에서 검사 통과/차단 케이스에 따라서
        // 시민의 상태 변화 및 출력을 구현
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "personName='" + personName + '\'' +
                ", nationality=" + nationality +
                ", gender=" + gender +
                ", hasPassport=" + hasPassport +
                ", hasDoneMillitary=" + hasDoneMillitary +
                ", hasCrimeRecord=" + hasCrimeRecord +
                '}'+"\n";
    }
}