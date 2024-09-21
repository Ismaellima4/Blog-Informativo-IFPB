package ifpb.factorys.interfaces;
/**
 * A interface IControllerFactory define um contrato para a criação de instâncias
 * de controladores, tanto para operações gerais quanto para operações de gerenciamento.
 */
import ifpb.controllers.interfaces.IController;
import ifpb.controllers.interfaces.IControllerManager;

public interface IControllerFactory {
    IController createController();
    IControllerManager createControllerManager();

}
