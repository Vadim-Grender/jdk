public class Frontender extends Developer implements FrontAction {
    @Override
    public void front() {
        System.out.println("Sleep");
    }

    void developerGUI() {
        System.out.printf("%s start develop GUI\n", getClass().toString());
    }
}
