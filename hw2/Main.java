public class Main {
    public static void main(String[] args) {
        Developer developer = new FullStack();
        ((FullStack) developer).back();
        Developer frontdev = new Frontender();
        ((Frontender) frontdev).front();
        ((Frontender) frontdev).developerGUI();
        Developer backdev = new Backender();
        ((Backender) backdev).back();
    }
}