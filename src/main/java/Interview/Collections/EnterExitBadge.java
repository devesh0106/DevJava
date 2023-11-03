package Interview.Collections;
/*
We are working on a security system for a badged-access room in our company's building.

Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:

1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit. (All employees are required to leave the room before the log ends.)

2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter. (The room is empty when the log begins.)

Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.

records1 = [
  ["Paul",     "enter"],
  ["Pauline",  "exit"],
  ["Paul",     "enter"],
  ["Paul",     "exit"],
  ["Martha",   "exit"],
  ["Joe",      "enter"],
  ["Martha",   "enter"],
  ["Steve",    "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "enter"],
  ["Joe",      "enter"],
  ["Curtis",   "exit"],
  ["Curtis",   "enter"],
  ["Joe",      "exit"],
  ["Martha",   "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "exit"],
  ["Joe",      "enter"],
  ["Joe",      "enter"],
  ["Martha",   "exit"],
  ["Joe",      "exit"],
  ["Joe",      "exit"]
]

Expected output: ["Steve", "Curtis", "Paul", "Joe"], ["Martha", "Pauline", "Curtis", "Joe"]
Other test cases:

records2 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
]

Expected output: [], []

records3 = [
  ["Paul", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
]

Expected output: ["Paul"], ["Paul"]

records4 = [
  ["Raj", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
  ["Paul", "enter"],
  ["Raj", "enter"],
]
Expected output: ["Raj", "Paul"], ["Paul"]

All Test Cases:
mismatches(records1) => ["Steve", "Curtis", "Paul", "Joe"], ["Martha", "Pauline", "Curtis", "Joe"]
mismatches(records2) => [], []
mismatches(records3) => ["Paul"], ["Paul"]
mismatches(records4) => ["Raj", "Paul"], ["Paul"]

n: length of the badge records array
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterExitBadge {
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
        List<String> exitMismatches = new ArrayList<>();
        List<String> enterMismatches = new ArrayList<>();

        mismatches(records1, exitMismatches, enterMismatches);

        System.out.println("Exit Mismatches: " + exitMismatches);
        System.out.println("Enter Mismatches: " + enterMismatches);
    }
    public static void mismatches(String[][] records, List<String> exitMismatches, List<String> enterMismatches) {
        Map<String, Integer> badgeCounts = new HashMap<>();

        for (String[] record : records) {
            String employeeName = record[0];
            String action = record[1];

            if (action.equals("enter")) {
                badgeCounts.put(employeeName, badgeCounts.getOrDefault(employeeName, 0) + 1);
            } else if (action.equals("exit")) {
                if (badgeCounts.containsKey(employeeName)) {
                    badgeCounts.put(employeeName, badgeCounts.get(employeeName) - 1);
                    if (badgeCounts.get(employeeName) == 0) {
                        badgeCounts.remove(employeeName);
                    }
                } else {
                    exitMismatches.add(employeeName);
                }
            }
        }

        enterMismatches.addAll(badgeCounts.keySet());
    }
}

