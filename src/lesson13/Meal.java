package lesson13;

public enum Meal {
    APPLE("Яблоко", 1),
    CARROT("Морковь", 0),
    PORRIDGE("Каша", 1),
    BROCCOLI("Брокколи", 0),
    BANANA("Банан", 1);

    private String title;
    private int preferences;

    Meal(String title, int preferences) {
        this.title = title;
        this.preferences = preferences;
    }

    public int getPreferences() {
        return preferences;
    }

    public String getTitle() {
        return title;
    }
}
