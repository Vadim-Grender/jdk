public class People {
    private int peopleId;
    private String phoneNumber;
    private String name;
    private int experience;

    public People(int peopleId, String phoneNumber, String name, int experience) {
        this.peopleId = peopleId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}