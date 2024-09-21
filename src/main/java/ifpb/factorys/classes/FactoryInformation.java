package ifpb.factorys.classes;
/**
 * A classe FactoryInformation implementa a interface IFactoryInformation e é responsável
 * pela criação de instâncias de IInformation, encapsulando um título e uma descrição.
 */
import ifpb.entitybasic.classes.Description;
import ifpb.entitybasic.classes.Information;
import ifpb.entitybasic.classes.Title;
import ifpb.entitybasic.interfaces.IDescription;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.entitybasic.interfaces.ITitle;
import ifpb.factorys.interfaces.IFactoryInformation;

public class FactoryInformation implements IFactoryInformation {
    @Override
    public IInformation create(String title, String description) throws Exception {
        ITitle titleObject = new Title(title);
        IDescription descriptionObject = new Description(description);
        return new Information(titleObject, descriptionObject);
    }
}
