package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IDescription;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.entitybasic.interfaces.ITitle;

public class Information implements IInformation {
    private ITitle title;
    private IDescription description;

    public Information(String title, String description) throws Exception {
        this.title = new Title(title);
        this.description = new Description(description);
    }

    @Override
    public void changeTitle(String title) throws Exception {
        this.title.changeTitle(title);
    }
    @Override
    public void changeDescription(String description) throws Exception {
        this.description.changeDescription(description);
    }

    @Override
    public IDescription getDescription() {
        return this.description;
    }

    @Override
    public ITitle getTitle() {
        return this.title;
    }
}
