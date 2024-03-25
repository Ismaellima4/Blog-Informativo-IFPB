package ifpb.entitybasic;

import ifpb.entitybasic.interfaces.IId;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ID<T> implements IId {
    public String id;

    @SafeVarargs
    public ID(T... args) {
        this.id = Arrays.stream(args).map(String::valueOf).collect(Collectors.joining("+","(",")"));
    }
}
