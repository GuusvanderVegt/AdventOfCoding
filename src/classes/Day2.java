package classes;

import java.util.List;

public class Day2 extends AOC{
    public Day2() {
        super("2");
    }

    @Override
    void solve(List<String> input) {

        int amountValid = 0;

        for (String line: input) {
            String[] parts = line.split(" ");

            char letter = parts[1].charAt(0);
            String word = parts[2];
            int firstIndex = Integer.parseInt(parts[0].split("-")[0]) - 1;
            int secondIndex = Integer.parseInt(parts[0].split("-")[1]) - 1;

            if(word.charAt(firstIndex) == letter ^ word.charAt(secondIndex) == letter){
                amountValid++;
            }

        }

        System.out.println("Amount of valid passwords: " + amountValid);

    }
}
