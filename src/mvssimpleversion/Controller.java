package mvssimpleversion;

import java.util.List;

public class Controller {

    private Model model = new Model();

    public List<String> onShowDataList() {
        return model.getStringDataList();
    }
}
