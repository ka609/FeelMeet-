public class Preference {
    private int userId;
    private int ageRangeMin;
    private int ageRangeMax;
    private String genderPreference;

    public Preference(int userId, int ageRangeMin, int ageRangeMax, String genderPreference) {
        this.userId = userId;
        this.ageRangeMin = ageRangeMin;
        this.ageRangeMax = ageRangeMax;
        this.genderPreference = genderPreference;
    }

    public int getUserId() {
        return userId;
    }

    public int getAgeRangeMin() {
        return ageRangeMin;
    }

    public int getAgeRangeMax() {
        return ageRangeMax;
    }

    public String getGenderPreference() {
        return genderPreference;
    }
}

