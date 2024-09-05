/**
 * A classe KeyWord implementa a interface IKeyWord e representa uma palavra-chave
 * que é associada a um identificador único. A classe valida e formata a palavra-chave
 * e utiliza um identificador (ID) para representá-la de forma única.
 * 
 * Princípios Aplicados:
 * 
 * - Single Responsibility Principle (SRP):
 *   A classe KeyWord é responsável por validar, formatar e associar uma palavra-chave a um identificador.
 * 
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por outras implementações de IKeyWord sem comprometer o comportamento do sistema.
 * 
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão ao permitir a modificação da forma de validação ou formatação
 *   sem alterar a lógica principal.
 * 
 * - Interface Segregation Principle (ISP):
 *   Implementa os métodos definidos na interface IKeyWord sem adicionar responsabilidades adicionais.
 * 
 * - Object Calisthenics: Small Entities:
 *   A classe encapsula a lógica relacionada a palavras-chave, mantendo-se pequena e focada.
 * 
 * - Object Calisthenics: One Dot Per Line:
 *   O código segue a regra de um ponto por linha, promovendo clareza e legibilidade.
 */


package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

public class KeyWord implements IKeyWord {
    private ID<String> id;
    private String word;

    public KeyWord(String word) throws InvalidNullException {
        this.word = this.formatWord(this.validate(word));
        this.id = new ID<String>(this.word);
    }
    @Override
    public boolean compareTo(KeyWord compareData) {
        return this.id.compareTo(compareData.id);
    }
    public String formatWord(String word) {
        return word.toUpperCase().trim();
    }
    private String validate(String word) throws InvalidNullException {
        if(word == null){
            throw new InvalidNullException();
        }
        return word;
    }
}