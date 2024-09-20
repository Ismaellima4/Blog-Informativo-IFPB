package ifpb;

import ifpb.controllers.interfaces.IControllerManager;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitybasic.interfaces.IUser;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.factorys.classes.FactoryAuthor;
import ifpb.factorys.classes.FactoryUser;
import ifpb.factorys.classes.NewsFactory;
import ifpb.factorys.interfaces.IFactoryAuthor;
import ifpb.factorys.interfaces.IFactoryUser;
import ifpb.factorys.interfaces.INewsFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/manager")
public class ManagerResource {

    private final IControllerManager controllerManager;

    public ManagerResource(IControllerManager controllerManager) {
        this.controllerManager = controllerManager;
    }

    @POST
    @Path("/user/signup")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response signUp(
            @FormParam("username") String username,
            @FormParam("name") String name,
            @FormParam("email") String email,
            @FormParam("password") String password
    ) throws InvalidNullException {
        IFactoryUser factoryUser = new FactoryUser();
        controllerManager.signUp(factoryUser.create(username, name, email, password));
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/user/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response updateUser(@PathParam("id") String id,
                               @FormParam("username") String username,
                               @FormParam("name") String name,
                               @FormParam("email") String email,
                               @FormParam("password") String password) throws InvalidNullException {
        IFactoryUser factoryUser = new FactoryUser();
        controllerManager.updateUser(new ID(id), factoryUser.create(username, name, email, password));
        return Response.ok().build();
    }

    @DELETE
    @Path("/users/{id}")
    public Response deleteUser(@PathParam("id") Integer id) throws InvalidNullException {
        controllerManager.deleteUser(new ID<>(id));
        return Response.noContent().build();
    }

    @POST
    @Path("/user/signin")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public Response signIn(@FormParam("id") String id, @FormParam("password") String password) throws InvalidNullException {
        try {
            int hash = controllerManager.signIn(id, password);
            return Response.ok(hash).build();
        } catch (Exception e){
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }

    @POST
    @Path("/news")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createNews(@FormParam("id") String id, @FormParam("title") String title, @FormParam("description") String description, @FormParam("authos") List<String> authors, @FormParam("news") String news) throws Throwable {
        INewsFactory newsFactory = new NewsFactory();
        controllerManager.createNews(newsFactory.create(id, title, description, ((String[]) authors.toArray()), news));
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/news/{id}")
    public Response deleteNews(@PathParam("id") Integer id) throws InvalidNullException {
        controllerManager.deleteNews(new ID<>(id));
        return Response.noContent().build();
    }

    @PUT
    @Path("/news/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response updateNews(@PathParam("id") String id,  @FormParam("title") String title, @FormParam("description") String description, @FormParam("authos") List<String> authors, @FormParam("news") String news) throws Throwable {
        INewsFactory newsFactory = new NewsFactory();

        controllerManager.updateNews(new ID<>(id), newsFactory.create(id, title, description, ((String[]) authors.toArray()), news));
        return Response.ok().build();
    }
//
//    @POST
//    @Path("/articles")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response createArticle(IArticle article) {
//        controllerManager.createArticle(article);
//        return Response.status(Response.Status.CREATED).build();
//    }
//
    @DELETE
    @Path("/articles/{id}")
    public Response deleteArticle(@PathParam("id") Integer id) throws InvalidNullException {
        controllerManager.deleteArticle(new ID<>(id));
        return Response.noContent().build();
    }
//
//    @PUT
//    @Path("/articles/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response updateArticle(@PathParam("id") Integer id, IArticle article) throws InvalidNullException {
//        controllerManager.updateArticle(new ID<>(id), article);
//        return Response.ok().build();
//    }
//
    @POST
    @Path("/author")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addAuthor(@FormParam("enroll") String enroll,
                              @FormParam("name") String name) {
        IFactoryAuthor factoryAuthor = new FactoryAuthor();
        IAuthor author = factoryAuthor.create(name,enroll);
        controllerManager.addAuthor(author);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/author/{id}")
    public Response removeAuthor(@PathParam("id") Integer id) throws InvalidNullException {
        controllerManager.removeAuthor(new ID<>(id));
        return Response.noContent().build();
    }

    @PUT
    @Path("/author/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response updateAuthor(@PathParam("id") Integer id,
                                 @FormParam("enroll") String enroll,
                                 @FormParam("name") String name) throws InvalidNullException {
        IFactoryAuthor factoryAuthor = new FactoryAuthor();
        IAuthor author = factoryAuthor.create(name, enroll);
        controllerManager.updateAuthor(new ID<>(id), author);
        return Response.ok().build();
    }

    @GET
    @Path("/authors")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAuthors() throws InvalidNullException {
        IAuthor[] authors = controllerManager.getAuthors();
        return Response.ok(authors).build();
    }

    @GET
    @Path("/author/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAuthorById(@PathParam("id") Integer id) throws InvalidNullException {
        IAuthor author = controllerManager.getAuthorById(new ID<>(id));
        if (author != null) {
            return Response.ok(author).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

//    @POST
//    @Path("/keywords")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response addKeyWord(IKeyWord keyWord) throws InvalidNullException {
//        controllerManager.addKeyWord(keyWord);
//        return Response.status(Response.Status.CREATED).build();
//    }
//
//    @DELETE
//    @Path("/keywords")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response removeKeyWord(IKeyWord keyWord) throws InvalidNullException {
//        controllerManager.removeKeyWord(keyWord);
//        return Response.noContent().build();
//    }
//
//    @PUT
//    @Path("/keywords")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response updateKeyWord(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException {
//        controllerManager.updateKeyWord(oldKeyWord, newKeyWord);
//        return Response.ok().build();
//    }
//
//    @GET
//    @Path("/keywords")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getKeyWords(IKeyWord[] keyWords) throws InvalidNullException {
//        IKeyWord[] result = controllerManager.getKeyWords(keyWords);
//        return Response.ok(result).build();
//    }
//
//    @GET
//    @Path("/keywords/{keyword}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getKeyWord(@PathParam("keyword") IKeyWord keyWord) throws InvalidNullException {
//        IKeyWord result = controllerManager.getKeyWord(keyWord);
//        if (result != null) {
//            return Response.ok(result).build();
//        } else {
//            return Response.status(Response.Status.NOT_FOUND).build();
//        }
//    }
}

