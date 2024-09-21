package ifpb;

import ifpb.controllers.interfaces.IControllerManager;
import ifpb.entitybasic.classes.ID;
import ifpb.entitybasic.classes.KeyWord;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IAuthor;
import ifpb.entitybasic.interfaces.IKeyWord;
import ifpb.entitycomplex.interfaces.IArticle;
import ifpb.entitycomplex.interfaces.INews;
import ifpb.factorys.classes.*;
import ifpb.factorys.interfaces.IArticleFactory;
import ifpb.factorys.interfaces.IFactoryAuthor;
import ifpb.factorys.interfaces.IFactoryUser;
import ifpb.factorys.interfaces.INewsFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

@Path("/manager")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ManagerResource {

    private final IControllerManager controllerManager;

    public ManagerResource(IControllerManager controllerManager) {
        this.controllerManager = controllerManager;
    }

    @POST
    @Path("/user/signup")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
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
    public Response createNews(@FormParam("id")String id,
                               @FormParam("title") String title,
                               @FormParam("description") String description,
                               @FormParam("authors") List<String> authors,
                               @FormParam("news") String news) throws Throwable {
        INewsFactory newsFactory = new NewsFactory();
        INews newsEntity = newsFactory.create(id, title, description, authors.toArray(String[]::new), news);
        controllerManager.createNews(newsEntity);
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
    public Response updateNews(@PathParam("id") String id,
                               @FormParam("title") String title,
                               @FormParam("description") String description,
                               @FormParam("authors") List<String> authors,
                               @FormParam("news") String news) throws Throwable {
        INewsFactory newsFactory = new NewsFactory();
        INews newsEntity = newsFactory.create(id, title, description, authors.toArray(String[]::new), news);
        controllerManager.updateNews(new ID<>(id), newsEntity);
        return Response.ok().build();
    }

    @POST
    @Path("/articles")
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    public Response createArticle(@FormParam("id") String id,
                                  @FormParam("title") String title,
                                  @FormParam("description") String description,
                                  @FormParam("authors") List<String> authors,
                                  @FormParam("keyWords") List<String> keyWords,
                                  @FormParam("article") FileInputStream file) throws Throwable {
        IArticleFactory articleFactory = new ArticleFactory();
        IArticle article = articleFactory.create(id, title, description, authors.toArray(String[]::new), keyWords.toArray(String[]::new), file);
        controllerManager.createArticle(article);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/articles/{id}")
    public Response deleteArticle(@PathParam("id") Integer id) throws InvalidNullException {
        controllerManager.deleteArticle(new ID<>(id));
        return Response.noContent().build();
    }

    @PUT
    @Path("/articles/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateArticle(@PathParam("id") String id,
                                  @FormParam("title") String title,
                                  @FormParam("description") String description,
                                  @FormParam("authors") List<String> authors,
                                  @FormParam("keyWords") List<String> keyWords,
                                  @FormParam("article") FileInputStream file) throws Throwable {
        IArticleFactory articleFactory = new ArticleFactory();
        IArticle article = articleFactory.create(id, title, description, authors.toArray(String[]::new), keyWords.toArray(String[]::new), file);
        controllerManager.updateArticle(new ID<>(id), article);
        return Response.ok().build();
    }

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
    public Response getAuthors() throws InvalidNullException {
        IAuthor[] authors = controllerManager.getAuthors();
        return Response.ok(authors).build();
    }

    @GET
    @Path("/author/{id}")
    public Response getAuthorById(@PathParam("id") Integer id) throws InvalidNullException {
        IAuthor author = controllerManager.getAuthorById(new ID<>(id));
        if (author != null) {
            return Response.ok(author).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Path("/keywords")
    public Response addKeyWord(@FormParam("keyword") String word) throws InvalidNullException {
        controllerManager.addKeyWord(new KeyWord(word));
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/keywords")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response removeKeyWord(@FormParam("keyword") String word) throws InvalidNullException {
        controllerManager.removeKeyWord(new KeyWord(word));
        return Response.noContent().build();
    }

    @PUT
    @Path("/keywords")
    public Response updateKeyWord(@FormParam("oldKeyword") String oldKeyWord,
                                  @FormParam("newKeyword") String  newKeyWord) throws InvalidNullException {
        controllerManager.updateKeyWord(new KeyWord(oldKeyWord), new KeyWord(newKeyWord));
        return Response.ok().build();
    }

    @GET
    @Path("/keywords")
    public Response getKeyWords(@FormParam("keywords") List<String> words) throws InvalidNullException {
        List<IKeyWord> keyWords = new ArrayList<>();
        for (String word: words){
            keyWords.add(new KeyWord(word));
        }
        IKeyWord[] result = controllerManager.getKeyWords(keyWords.toArray(IKeyWord[]::new));
        return Response.ok(result).build();
    }

    @GET
    @Path("/keywords/{word}")
    public Response getKeyWord(@PathParam("word") String word) throws InvalidNullException {
        IKeyWord result = controllerManager.getKeyWord(new KeyWord(word));
        if (result != null) {
            return Response.ok(result).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}

