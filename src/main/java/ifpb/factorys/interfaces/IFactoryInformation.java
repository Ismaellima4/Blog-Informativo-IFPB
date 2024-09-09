package ifpb.factorys.interfaces;

import ifpb.entitybasic.interfaces.IInformation;

public interface IFactoryInformation {
    IInformation create(String title, String description) throws Exception;
}
