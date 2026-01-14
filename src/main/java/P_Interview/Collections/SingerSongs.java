package P_Interview.Collections;

import java.util.HashMap;
import java.util.Map;

public class SingerSongs {
        public static boolean singable(String[] song, String lowestNote, String highestNote) {
            // Define the order of pitch letters
            String pitchOrder = "CDEFGAB";

            // Convert pitch letters to their corresponding numerical values
            Map<Character, Integer> pitchValues = new HashMap<>();
            for (int i = 0; i < pitchOrder.length(); i++) {
                pitchValues.put(pitchOrder.charAt(i), i);
            }

            // Parse the lowest and highest notes into pitch and octave
            char lowestPitch = lowestNote.charAt(0);
            int lowestOctave = Integer.parseInt(lowestNote.substring(1));
            char highestPitch = highestNote.charAt(0);
            int highestOctave = Integer.parseInt(highestNote.substring(1));

            // Check each note in the song
            for (String note : song) {
                char pitch = note.charAt(0);
                int octave = Integer.parseInt(note.substring(1));

                // Compare pitch and octave with the singer's range
                if (octave < lowestOctave || octave > highestOctave) {
                    return false; // The note is outside the singer's range
                } else if (octave == lowestOctave && pitchValues.get(pitch) < pitchValues.get(lowestPitch)) {
                    return false; // The note is lower than the singer's lowest note
                } else if (octave == highestOctave && pitchValues.get(pitch) > pitchValues.get(highestPitch)) {
                    return false; // The note is higher than the singer's highest note
                }
            }

            return true; // All notes are within the singer's range
        }

        public static void main(String[] argv) {
            String[] song1 = {"F4", "B4", "C5"};
            String[] song2 = {"C3", "E3", "G3", "C4", "E4", "G4", "C5"};
            String[] song3 = {"B4", "F5", "B5"};
            String[] song4 = {"B4", "E4", "G4", "G4", "A4", "B4", "E4",
                    "B4", "E4", "G4", "G4", "A4", "C5", "B4",
                    "E5", "G4", "G4", "A4", "B4", "C5", "D5",
                    "C5", "B4", "C5", "E5", "D5", "C5", "C5",
                    "B4", "B4", "E5", "E4", "G4", "G4", "A4",
                    "B4", "B4", "B4", "C5", "E5", "A5", "E5",
                    "C5", "A4", "E5", "D5", "C5", "B4"};
            String[] song5 = {"F4"};

            // Test cases
            System.out.println(singable(song1, "F4", "C5")); // True
            System.out.println(singable(song1, "A4", "C5")); // False
            System.out.println(singable(song2, "B2", "C5")); // True
            System.out.println(singable(song2, "C3", "B4")); // False
            System.out.println(singable(song3, "B4", "B5")); // True
            System.out.println(singable(song3, "B4", "C5")); // False
            System.out.println(singable(song4, "D4", "A5")); // True
            System.out.println(singable(song4, "D4", "G5")); // False
            System.out.println(singable(song4, "D4", "C6")); // True
            System.out.println(singable(song4, "F4", "C6")); // False
            System.out.println(singable(song5, "D4", "E4")); // False
        }
    }

