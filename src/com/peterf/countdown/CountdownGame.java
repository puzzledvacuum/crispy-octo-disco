package com.peterf.countdown;

import java.util.ArrayList;

public class CountdownGame {
    private static final Operation[] OPERATIONS = { new Add(), new Subtract(), new Multiply(), new Divide() };

    private ArrayList<String> solution = new ArrayList<>();

    public boolean findSolution(int[] t, int nb, int total) {
        for (int i = 0; i < nb; i++) {
            if (t[i] == total) {
                return true;
            }

            for (int j = i + 1; j < nb; j++) {
                for (int k = 0; k < OPERATIONS.length; k++) {
                    int res = OPERATIONS[k].eval(t[i], t[j]);

                    if (res != 0) {
                        int savei = t[i], savej = t[j];
                        t[i] = res;
                        t[j] = t[nb-1];

                        if (findSolution(t, nb- 1, total)) {
                            solution.add(Math.max(savei, savej) + " " +
                                    OPERATIONS[k].symbol() + " " +
                                    Math.min(savei,  savej) + " = " + res);
                            return true;
                        }

                        t[i] = savei;
                        t[j] = savej;
                    }
                }
            }
        }

        return false;
    }

    public void printSolution() {
        for (int i = solution.size() - 1; i >= 0; i--) {
            System.out.println(solution.get(i));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {100, 2, 75, 3, 1, 10};
        int total = 848;

        CountdownGame game = new CountdownGame();

        if (game.findSolution(numbers, numbers.length, total)){
            System.out.println("The game has a solution");
            game.printSolution();
        } else {
            System.out.println("The game has no solution");
        }
    }
}
