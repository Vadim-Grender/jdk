import java.util.ArrayList;
import java.util.List;
public class PeopleBook {
    private List<People> people;

    public PeopleBook() {
        this.people = new ArrayList<>();
    }

    public void addPeople(People People) {
        people.add(People);
    }

    public List<People> findPeoplesByExperience(int targetExperience) {
        List<People> result = new ArrayList<>();
        for (People People : people) {
            if (People.getExperience() == targetExperience) {
                result.add(People);
            }
        }
        return result;
    }

    public List<String> findPhoneNumbersByName(String targetName) {
        List<String> result = new ArrayList<>();
        for (People People : people) {
            if (People.getName().equals(targetName)) {
                result.add(People.getPhoneNumber());
            }
        }
        return result;
    }

    public People findPeopleByPeopleId(int targetPeopleId) {
        for (People People : people) {
            if (People.getPeopleId() == targetPeopleId) {
                return People;
            }
        }
        return null;
    }
}