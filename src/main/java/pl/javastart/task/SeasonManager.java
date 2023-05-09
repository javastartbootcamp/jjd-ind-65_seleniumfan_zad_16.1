package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku");
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season.getPlName());
        }
        String inputString = scanner.nextLine();
        Season season = Season.parseToEnum(inputString);
        System.out.println("W tej porze roku są następujące miesiące:\n" + Arrays.toString(season.getMonths()));
    }
}
