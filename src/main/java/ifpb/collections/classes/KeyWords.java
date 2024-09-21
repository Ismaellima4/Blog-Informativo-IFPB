package ifpb.collections.classes;
/**
 * A classe KeyWords implementa a interface IKeyWords e gerencia uma coleção de palavras-chave.
 * Fornece métodos para adicionar, remover, atualizar e recuperar palavras-chave,
 * garantindo a consistência e a integridade da coleção.
 *
 * Princípios Aplicados:
 *
 * - Single Responsibility Principle (SRP):
 *   A classe é responsável apenas por gerenciar a coleção de palavras-chave, oferecendo
 *   métodos para manipulação segura e eficiente da coleção.
 *
 * - Liskov Substitution Principle (LSP):
 *   A classe pode ser substituída por qualquer outra implementação de IKeyWords
 *   sem comprometer o funcionamento correto do sistema.
 *
 * - Open/Closed Principle (OCP):
 *   A classe está aberta para extensão, permitindo novas funcionalidades, como novas formas
 *   de gerenciar palavras-chave, sem modificar o código existente.
 *
 * - Interface Segregation Principle (ISP):
 *   Implementa apenas os métodos definidos na interface IKeyWords, mantendo as responsabilidades
 *   claramente definidas e separadas.
 *
 * - Object Calisthenics: First Class Collections:
 *   Encapsula a lista de palavras-chave, evitando a manipulação direta da lista interna.
 *
 * - Object Calisthenics: No Primitives:
 *   Utiliza a interface IKeyWord para representar palavras-chave, evitando o uso de tipos primitivos e
 *   melhorando a expressividade e o encapsulamento.
 */
import ifpb.collections.interfaces.IKeyWords;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IKeyWord;

import java.util.ArrayList;

public class KeyWords implements IKeyWords {

    private ArrayList<IKeyWord> keyWords = new ArrayList<>();

    @Override
    public void add(IKeyWord keyWord) {
        this.keyWords.add(keyWord);
    }


    @Override
    public int remove(IKeyWord keyWord) throws InvalidNullException {
        IKeyWord value = get(keyWord);
        if(value != null){
            this.keyWords.remove(value);
            return 1;
        }
        return 0;
    }

    @Override
    public int update(IKeyWord oldKeyWord, IKeyWord newKeyWord) throws InvalidNullException {
        int result = remove(oldKeyWord);
        if (result == 1){
            add(newKeyWord);
            return 1;
        }
        return 0;
    }

    @Override
    public IKeyWord get(IKeyWord keyWord) throws InvalidNullException {
        for (IKeyWord value : this.keyWords){
            if(value.compareTo(keyWord)) return value;
        }
        throw new InvalidNullException();
    }

    @Override
    public IKeyWord[] get(IKeyWord[] keyWords) throws InvalidNullException {
        if (this.keyWords.isEmpty()) throw new InvalidNullException();
        IKeyWord[] resultArray = new IKeyWord[keyWords.length];
        for (int i = 0; i < keyWords.length; i++){
            resultArray[i] = this.get(keyWords[i]);
            if (resultArray[i] == null){
                this.add(keyWords[i]);
                resultArray[i] = keyWords[i];
            }
        }
        return resultArray;
    }


    @Override
    public IKeyWord[] get() throws InvalidNullException {
        if (keyWords.isEmpty()) throw new InvalidNullException();
        IKeyWord[] array = new IKeyWord[this.keyWords.size()];
        for (int i = 0; i < this.keyWords.size(); i++){
            array[i] = this.keyWords.get(i);
        }
        return array;
    }

    @Override
    public int getSize() {
        return this.keyWords.size();
    }
}
