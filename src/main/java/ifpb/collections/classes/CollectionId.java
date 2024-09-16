package ifpb.collections.classes;

import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.interfaces.IID;

import java.util.ArrayList;

public class CollectionId implements ICollectionId {
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
    public IID[] getAll() {
        IID[] ids = new IID[listId.size() - 1];
        for(int i = 0; i<listId.size(); i++){
            ids[i] = listId.get(i);
        }
        return ids;
    }

    @Override
    public IID getById(IID id) {
        for (int i = 0; i< listId.size(); i++){
            if(listId.get(i).compareTo(id)){
                return listId.get(i);
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return this.listId.size();
    }
}
