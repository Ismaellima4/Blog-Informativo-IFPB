package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IKeyWord;

// Esta classe tem sentido estar aclopada ao ID, pois ela serve como um ENUM dinâmico;
public class KeyWord implements IKeyWord {
    private ID<String> id;
    private String word;

    public KeyWord(String word) throws InvalidNullException {
        this.word = this.formatWord(this.validate(word));
        this.id = new ID<String>(this.word);
    }
    @Override
    public boolean compareTo(IKeyWord compareData) {
        return this.id.compareTo(compareData.getId());
    }

    @Override
    public IID getId() {
        return this.id;
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
