public class Profile {
    private int userId;
    private String bio;
    private int age;
    private String gender;
    private String interests;
    private String location;

    public Profile(int userId, String bio, int age, String gender, String interests, String location) {
        this.userId = userId;
        this.bio = bio;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
        this.location = location;
    }

    public int getUserId() {
        return userId;
    }

    public String getBio() {
        return bio;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getInterests() {
        return interests;
    }

    public String getLocation() {
        return location;
    }
}
