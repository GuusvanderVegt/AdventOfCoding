package classes;

import java.util.List;

public class Day1 extends AOC{
    public Day1() {
        super("1");
    }

    @Override
    void solve(List<String> input) {
        int firstNumber, secondNumber, thirdNumber;

        for (int i = 0; i < input.size(); i++) {
            firstNumber = Integer.parseInt(input.get(i));

            for (int j = i + 1; j < input.size(); j++) {
                secondNumber = Integer.parseInt(input.get(j));

                if((firstNumber + secondNumber) == 2020){
                    System.out.println("Answer for Part 1 is: " + (firstNumber * secondNumber));
                }

                for (int k = j + 1; k < input.size(); k++) {
                    thirdNumber = Integer.parseInt(input.get(k));

                    if((firstNumber + secondNumber + thirdNumber) == 2020){
                        System.out.println("Answer for Part 2 is: " + (firstNumber * secondNumber * thirdNumber));
                    }
                }


            }
        }
    }
}
