# Mini Mundo - IFPB Blog Campus Esperança

## Projeto para publicações de notícias e artigos

Com o intuito de melhorar a exposição de projetos, artigos, publicações e trabalhos feitos pelo IFPB campus Esperança,
além de noticiar eventos e apresentações feitas na instituição, é pensado um blog. Logo, este projeto é um blog, com o
intuito de promover essa melhoria de visibilidade, como também de facilitar a postagem e submissões de trabalhos feitos
pelos estudantes e funcionários desta rede pública de ensino, IFPB.

Dessa forma, nosso sistema visa a aplicação para dois públicos: Um usuário público, que terá como ver as notícias, e
trabalhos que estarão amostra no site; Um usuário administrador, que poderá fazer submissões de artigos e notícias, além
poder também consumir esta aplicação. Sendo assim o projeto tem a finalidade de promover funcionalidades para a
submissões de artigos, projetos, trabalhos de conclusão de curso, oportunidades de bolsa e estágio, etc.

Seguindo, pensando numa melhor utilização e para atingir os objetivos propostos, neste site terá um tela inicial
mostrando as notícias do campus, e numa área do menu, será mostrado a opção para o usuário navegar nele. O Usuário
poderá ver lista de publicações de trabalho dividido por tipos de pesquisa, irá poder filtrar pelas palavras chaves que
deseja, além de autores e orientadores. Ademais, poderá também verificar as notícias do IFPB esperança, como
oportunidades de bolsa e editais para que facilite a busca e o conhecimento da informação.

Portanto, é o blog pensado para cumprir a missão de ser uma melhora no compartilhamento de pesquisas feitas no campus de
Esperança, e um portal de notícias com a finalidade de promover um aumento na disseminação dessas informações.



# Casos de Uso

## Funcionalidades comuns a todos:

### Caso de Uso: Mostrar Artigo
**Ator Principal:** Usuário
**Pré-condições:** O artigo deve existir no sistema.
**Fluxo Principal:**
1. O usuário solicita a visualização de um artigo.
2. O sistema recupera e exibe o artigo.

### Caso de Uso: Mostrar Notícia por ID
**Ator Principal:** Usuário
**Pré-condições:** A notícia deve existir no sistema.
**Fluxo Principal:**
1. O usuário solicita a visualização de uma notícia por ID.
2. O sistema recupera e exibe a notícia correspondente ao ID.

### Caso de Uso: Mostrar Notícias
**Ator Principal:** Usuário
**Pré-condições:** As notícias devem existir no sistema.
**Fluxo Principal:**
1. O usuário solicita a visualização de todas as notícias.
2. O sistema recupera e exibe todas as notícias.

### Caso de Uso: Mostrar Artigos
**Ator Principal:** Usuário
**Pré-condições:** Os artigos devem existir no sistema.
**Fluxo Principal:**
1. O usuário solicita a visualização de todos os artigos.
2. O sistema recupera e exibe todos os artigos.

### Caso de Uso: Autenticar
**Ator Principal:** Usuário
**Pré-condições:** O usuário deve ter uma conta no sistema.
**Fluxo Principal:**
1. O usuário solicita autenticação.
2. O sistema verifica as credenciais do usuário e confirma a autenticação.

## Funcionalidades específicas do administrador:

### Caso de Uso: Adicionar Submissão
**Ator Principal:** Administrador
**Pré-condições:** Nenhuma
**Fluxo Principal:**
1. O administrador solicita a adição de uma nova submissão.
2. O sistema adiciona a submissão e confirma a operação para o administrador.

### Caso de Uso: Remover Submissão
**Ator Principal:** Administrador
**Pré-condições:** A submissão deve existir no sistema.
**Fluxo Principal:**
1. O administrador solicita a remoção de uma submissão.
2. O sistema remove a submissão e confirma a operação para o administrador.

### Caso de Uso: Editar Submissão
**Ator Principal:** Administrador
**Pré-condições:** A submissão deve existir no sistema.
**Fluxo Principal:**
1. O administrador solicita a edição de uma submissão.
2. O sistema edita a submissão e confirma a operação para o administrador.

### Caso de Uso: Adicionar Notícia
**Ator Principal:** Administrador
**Pré-condições:** Nenhuma
**Fluxo Principal:**
1. O administrador solicita a adição de uma nova notícia.
2. O sistema adiciona a notícia e confirma a operação para o administrador.

### Caso de Uso: Excluir Notícia
**Ator Principal:** Administrador
**Pré-condições:** A notícia deve existir no sistema.
**Fluxo Principal:**
1. O administrador solicita a exclusão de uma notícia.
2. O sistema exclui a notícia e confirma a operação para o administrador.

### Caso de Uso: Editar Notícia
**Ator Principal:** Administrador
**Pré-condições:** A notícia deve existir no sistema.
**Fluxo Principal:**
1. O administrador solicita a edição de uma notícia.
2. O sistema edita a notícia e confirma a operação para o administrador.

### Caso de Uso: Cadastrar
**Ator Principal:** Administrador
**Pré-condições:** Nenhuma
**Fluxo Principal:**
1. O administrador solicita o cadastro de um novo usuário.
2. O sistema cadastra o usuário e confirma a operação para o administrador.

### LINK: https://docs.google.com/document/d/1cRi4ArQFVnF4WfdasUitLyF4_fRpecvx2HA4txAp3kg/edit?usp=sharing
