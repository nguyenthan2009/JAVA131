public class AppNotificaton implements  Observer{
    @Override
    public void update(String mess) {
        System.out.println(" App " + mess);
    }
}
