public class FullStack extends Developer implements BackendAction, FrontAction {
    @Override
    public void back() {
        System.out.printf("%s working\n" , getClass().toString());
    }

    @Override
    public void front() {

    }
}
