package lesson13;

public enum Meal {
    APPLE("Яблоко", true),
    CARROT("Морковь", false),
    PORRIDGE("Каша", true),
    BROCCOLI("Брокколи", false),
    BANANA("Банан", true);

    private String title;
    private boolean preferences;

    Meal(String title, boolean preferences) {
        this.title = title;
        this.preferences = preferences;
    }

    public boolean isPreferences() {
        return preferences;
    }

    public String getTitle() {
        return title;
    }
}
