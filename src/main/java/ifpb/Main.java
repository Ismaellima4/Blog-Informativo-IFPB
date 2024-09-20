package ifpb;

import ifpb.factorys.classes.ControllerFactoryMemory;
import ifpb.factorys.interfaces.IControllerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        IControllerFactory controllerFactory = new ControllerFactoryMemory();

        ResourceConfig config = new ResourceConfig();
        config.register(new Resource(controllerFactory.createController()));
        config.register(new ManagerResource(controllerFactory.createControllerManager()));

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);
        context.addServlet(new ServletHolder(new ServletContainer(config)), "/*");

        server.start();
        server.join();
    }
}