package pl.javastart.task;

import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String plName;
    private final String[] months;

    Season(String plName, String[] months) {
        this.plName = plName;
        this.months = months;
    }

    public String getPlName() {
        return plName;
    }

    public String[] getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return plName;
    }

    public static Season parseToEnum(String seasonPlName) {
        return Arrays.stream(Season.values())
                .filter(season -> season.getPlName().equalsIgnoreCase(seasonPlName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Brak enuma o takiej nazwie pory roku"));
    }
}