package ifpb.collections.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;

import java.util.ArrayList;

public class CollectionId implements ICollection<IID> {
    ArrayList<IID> listId = new ArrayList<>();
    @Override
    public void add(IID id) {
        listId.add(id);
    }

    @Override
    public int remove(IID id) {
        boolean result = listId.remove(id);
        return result ? 0: 1;
    }

    @Override
    public IID[] getAll() throws InvalidNullException {
        if (listId.isEmpty()) throw new InvalidNullException();
        IID[] ids = new IID[listId.size() - 1];
        for(int i = 0; i<listId.size(); i++){
            ids[i] = listId.get(i);
        }
        return ids;
    }

    @Override
    public int update(IID ID, IID content) {

        if(ID != null){
            int result = this.remove(ID);
            if (result == 0){
                add(content);
            }
            return result;
        }
        return 0;
    }

    @Override
    public IID getById(IID id) throws InvalidNullException {
        for (int i = 0; i< listId.size(); i++){
            if(listId.get(i).compareTo(id)){
                return listId.get(i);
            }
        }
        throw new InvalidNullException();
    }

    @Override
    public int getSize() {
        return this.listId.size();
    }
}
