public interface FrontAction {
    void front();
    default void tea() {
        System.out.println("Drink");
    };
}
