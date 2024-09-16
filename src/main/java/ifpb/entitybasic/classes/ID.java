package ifpb.entitybasic.classes;

import ifpb.entitybasic.interfaces.IID;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ID<T> implements IID {
    private final String id;

    @SafeVarargs
    public ID(T... args) {
        this.id = Arrays.stream(args).map(String::valueOf).collect(Collectors.joining("+","(",")"));
    }

    @Override
    public String getId() {
        return this.id;
    }

    public boolean compareTo(IID compareId) {
        return this.id.equals(compareId.getId());
    }
}
