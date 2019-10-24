package mvssimpleversion;


public class View {

    private Controller controller = new Controller();

    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }
}
