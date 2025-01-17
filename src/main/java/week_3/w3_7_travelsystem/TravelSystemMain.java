package week_3.w3_7_travelsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelSystemMain {
    public static void main(String[] args) {
        // 1. 국가와 시민들을 생성
        //      국가명
        //          국가 종류
        //              자유민주주의 체제 2개
        //              :"korea", "US"
        //              독재 2개
        //              :"Russia", "NKorea"
        Nation korea = new Nation("Korea", "Democracy");
        Nation US = new Nation("US", "Democracy");
        Nation russia = new Nation("Russia", "Detective");
        Nation nkorea = new Nation("NKorea", "Detective");

        List<Nation> nations = new ArrayList<>(
                Arrays.asList(korea, US, russia, nkorea)
        );
        //          시민 종류
        //              이름과 나이
        //              전과자 유/무
        //              병역 군필/미필
        //              남성/여성
        //              여권 유/무

        Citizen kor1 = new Citizen(
                "kim",korea , 1,true ,true ,false
        );
        Citizen kor2 = new Citizen(
                "park",korea , 3,true ,false ,true
        );
        Citizen us1 = new Citizen(
                "yu",US , 2,true ,false ,false
        );
        Citizen us2 = new Citizen(
                "we",US , 4,true ,false ,false
        );
        Citizen rus1 = new Citizen(
                "lee",russia , 1,true ,false ,false
        );
        Citizen rus2 = new Citizen(
                "shin",russia , 2,true ,false ,false
        );
        Citizen nk1 = new Citizen(
                "han",nkorea , 3,false ,true ,true
        );
        Citizen nk2 = new Citizen(
                "정은",nkorea, 4,false ,true ,true
        );
        List<Citizen> citizens = new ArrayList<>(
                Arrays.asList(kor1,kor2,us1,us2,rus1,rus2)
        );

        System.out.println(nations);
        System.out.println(citizens);
    }
}
