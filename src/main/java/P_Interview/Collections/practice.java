package P_Interview.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice {
    public static void main(String[] args) {
        String[][] records1 = {
                {"Paul", "enter"}, {"Pauline", "exit"}, {"Paul", "enter"},
                {"Paul", "exit"}, {"Martha", "exit"}, {"Joe", "enter"},
                {"Martha", "enter"}, {"Steve", "enter"}, {"Martha", "exit"},
                {"Jennifer", "enter"}, {"Joe", "enter"}, {"Curtis", "exit"},
                {"Curtis", "enter"}, {"Joe", "exit"}, {"Martha", "enter"},
                {"Martha", "exit"}, {"Jennifer", "exit"}, {"Joe", "enter"},
                {"Joe", "enter"}, {"Martha", "exit"}, {"Joe", "exit"},
                {"Joe", "exit"}
        };
        List<String> exitMisMatches = new ArrayList<>();
        List<String> entryMisMatches = new ArrayList<>();
        
        mismatch(records1,exitMisMatches,entryMisMatches);
        System.out.println("Entry Mismtach" + entryMisMatches);
        System.out.println("Exit Mismatch"+ exitMisMatches);
    }

    private static void mismatch(String[][] records1, List<String> exitMisMatches, List<String> entryMisMatches) {
        Map<String, Integer> badgeCount = new HashMap<>();
        for(String[] record : records1) {
            String employee = record[0];
            String action = record[1];
            if (action == "enter"){
                badgeCount.put(employee, badgeCount.getOrDefault(employee,0)+1);
            }else if(action=="exit") {
                        if(badgeCount.containsKey(employee)) {
                            badgeCount.put(employee, badgeCount.get(employee) - 1);

                            if (badgeCount.get(employee) == 0) {
                                badgeCount.remove(employee);
                            }
                            else
                                exitMisMatches.add(employee);
                        }
                        }
                    }
        entryMisMatches.addAll(badgeCount.keySet());
    }
}
