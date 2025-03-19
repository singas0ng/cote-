// Fill in the blank
//mode_type  	humidity	val_set	    result
//"auto"	    23	        45	        3
//"target"	    41	        40	        1
//"minimum"	    10	        34	        1
//Since it is in "auto" mode, the amount of humidification is adjusted according to the humidity. Since the current humidity is above 20 and less than 30, 3 is returned.
//In "target" mode, since the humidity is higher than the set value, 1 is returned.
//In "minimum" mode, since the humidity is lower than the set value, 1 is returned.

class Solution {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
            return 3;
                    // blank
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
        // blank
            return 5;
            // blank
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
        return 0;
            // blank
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
            answer = func2(humidity);
                    // blank
        }
        else if(mode_type.equals("target")){
            answer = func1(humidity, val_set);
                    // blank
        }
        else if(mode_type.equals("minimum")){
            answer = func3(humidity, val_set);
                        // blank
        }

        return answer;
    }
}
