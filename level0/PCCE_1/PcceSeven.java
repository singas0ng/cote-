// 2차원 배열 문제 --> [["On", "On", "On"], ["Off", "On", "-"], ["Off", "-", "-"]] 이거의 length 는 3
// 반복문 돌릴때 1차원 배열 안에 있는 애들을 한꺼번에 처리 --> ["On", "On", "On"] 이거를 한방에 처리
// 남아있는 좌석 구하는거라서 seat - num_passenger

Class Solution {
public int solution(int seat, String[][] passengers) {
    int num_passenger = 0;
    for(int i=0; i<passengers.length; i++){
        num_passenger += func4(passengers[i]);
                            //fill in the blanks
        num_passenger -= func3(passengers[i]);
                            //fill in the blanks
    }
    int answer = func1(seat - num_passenger);
                    //fill in the blanks
    return answer;
}

public int func1(int num){
    if(0 > num){
        return 0;
    }
    else{
        return num;
    }
}
public int func2(int num){
    if(num > 0){
        return 0;
    }
    else{
        return num;
    }
}

public int func3(String[] station){
    int num = 0;
    for(int i=0; i<station.length; i++){
        if(station[i].equals("Off")){
            num += 1;
        }
    }
    return num;
}

public int func4(String[] station){
    int num = 0;
    for(int i=0; i<station.length; i++){
        if(station[i].equals("On")){
            num += 1;
        }
    }
    return num;
}
}
