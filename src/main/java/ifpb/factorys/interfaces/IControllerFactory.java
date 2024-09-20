package ifpb.factorys.interfaces;

import ifpb.controllers.interfaces.IController;
import ifpb.controllers.interfaces.IControllerManager;

public interface IControllerFactory {
    IController createController();
    IControllerManager createControllerManager();

}
