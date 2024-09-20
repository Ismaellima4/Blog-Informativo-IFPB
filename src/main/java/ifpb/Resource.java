package ifpb;

import ifpb.controllers.interfaces.IController;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class Resource {

    private final IController controller;

    public Resource(IController controller) {
        this.controller = controller;
    }

    @GET
    @Path("news/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNewsById(@PathParam("id") Integer id) throws InvalidNullException {
        INews news = controller.getNewsById(new ID<>(id));
        if (news != null) {
            return Response.ok(news).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/news")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllNews() throws InvalidNullException {
        INews[] newsList = controller.getNews();
        return Response.ok(newsList).build();
    }

    @GET
    @Path("/articles/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getArticleById(@PathParam("id") Integer id) throws InvalidNullException {
        IArticle article = controller.getArticleById(new ID<>(id));
        if (article != null) {
            return Response.ok(article).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @GET
    @Path("/articles")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllArticles() throws InvalidNullException {
        IArticle[] articlesList = controller.getArticles();
        return Response.ok(articlesList).build();
    }
}
