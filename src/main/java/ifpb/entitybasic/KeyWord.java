package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IKeyWord;

public class KeyWord implements IKeyWord {
    private ID<String> id;
    private String word;

    public KeyWord(String word){
        this.word = formatWord(word);
        this.id = new ID<>(this.word);
    }

    public String formatWord(String word) {
        return word.toUpperCase().trim();
    }
}
