package classes;

import java.util.List;

public class Day3 extends AOC{
    public Day3() {
        super("3");
    }

    @Override
    void solve(List<String> input) {
        char[][] field = new char[input.size()][input.get(0).length()];

        for (int i = 0; i < input.size(); i++) {
            char[] chars = input.get(i).toCharArray();

            System.arraycopy(chars, 0, field[i], 0, chars.length);
        }

        System.out.println("The answer for part 1 is: " + getAmountOfThrees(3, 1, field) + " trees.");

        int amountOfThrees1 = getAmountOfThrees(1, 1, field);
        int amountOfThrees2 = getAmountOfThrees(3, 1, field);
        int amountOfThrees3 = getAmountOfThrees(5, 1, field);
        int amountOfThrees4 = getAmountOfThrees(7, 1, field);
        int amountOfThrees5 = getAmountOfThrees(1, 2, field);

        int answerPart2 = amountOfThrees1 * amountOfThrees2 * amountOfThrees3 * amountOfThrees4 * amountOfThrees5;

        System.out.println("The answer for part 2 is: " + answerPart2 + " trees");

    }

    public int getAmountOfThrees(int xStep, int yStep, char[][] field){
        int amountOfThrees = 0;

        int x = 0;
        int y = 0;

        while(y < field.length){
            if(field[y][x] == '#') {
                amountOfThrees++;
            }

            if(x + xStep >= field[0].length){
                x = (xStep - (field[0].length - x));
            } else{
                x += xStep;
            }

            y += yStep;

        }

        return amountOfThrees;
    }
}
