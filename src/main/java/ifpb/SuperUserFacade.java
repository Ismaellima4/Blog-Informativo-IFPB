package blog;

public interface SuperUserFacade extends UserFacade {
    @Override
    void login();

    @Override
    void sair();

    @Override
    void acessarArtigo();

    @Override
    void acessarArtigos();

    @Override
    void acessarNoticias();

    @Override
    void acessarNoticia();

    void addArtigo();
    void deletarArtigo();
    void addNoticia();
    void editarNoticia();
    void deletarNoticia();
    void acessarUsuarios();
    void acessarUsuario();

}
