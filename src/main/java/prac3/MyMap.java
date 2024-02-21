package prac3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;


public class MyMap<Kk,Vv> implements Map<Kk, Vv> {
    private final Map<Kk, Vv> internal = new HashMap<>();

    @Override
    synchronized public Vv getOrDefault(Object key, Vv defaultValue) {
        return Map.super.getOrDefault(key, defaultValue);
    }

    @Override
    synchronized public void forEach(BiConsumer<? super Kk, ? super Vv> action) {
        Map.super.forEach(action);
    }

    @Override
    synchronized public void replaceAll(BiFunction<? super Kk, ? super Vv, ? extends Vv> function) {
        Map.super.replaceAll(function);
    }

    @Override
    synchronized public Vv putIfAbsent(Kk key, Vv value) {
        return Map.super.putIfAbsent(key, value);
    }

    @Override
    synchronized public boolean remove(Object key, Object value) {
        return Map.super.remove(key, value);
    }

    @Override
    synchronized public boolean replace(Kk key, Vv oldValue, Vv newValue) {
        return Map.super.replace(key, oldValue, newValue);
    }

    @Override
    synchronized public Vv replace(Kk key, Vv value) {
        return Map.super.replace(key, value);
    }

    @Override
    synchronized public Vv computeIfAbsent(Kk key, Function<? super Kk, ? extends Vv> mappingFunction) {
        return Map.super.computeIfAbsent(key, mappingFunction);
    }

    @Override
    synchronized public Vv computeIfPresent(Kk key, BiFunction<? super Kk, ? super Vv, ? extends Vv> remappingFunction) {
        return Map.super.computeIfPresent(key, remappingFunction);
    }

    @Override
    synchronized public Vv compute(Kk key, BiFunction<? super Kk, ? super Vv, ? extends Vv> remappingFunction) {
        return Map.super.compute(key, remappingFunction);
    }

    @Override
    synchronized public Vv merge(Kk key, Vv value, BiFunction<? super Vv, ? super Vv, ? extends Vv> remappingFunction) {
        return Map.super.merge(key, value, remappingFunction);
    }

    @Override
    synchronized public int size() {
        return internal.size();
    }

    @Override
    synchronized public boolean isEmpty() {
        return internal.isEmpty();
    }

    @Override
    synchronized public boolean containsKey(Object o) {
        return internal.containsKey(o);
    }

    @Override
    synchronized public boolean containsValue(Object o) {
        return internal.containsValue(o);
    }

    @Override
    synchronized public Vv get(Object o) {
        return internal.get(o);
    }

    @Override
    synchronized public Vv put (Kk o, Vv o2) {
        return internal.put((Kk) o, (Vv) o2);
    }

    @Override
    synchronized public Vv remove(Object o) {
        return internal.remove(o);
    }

    @Override
    synchronized public void putAll(Map<? extends Kk, ? extends Vv> map) {
        internal.putAll(map);
    }

    @Override
    synchronized public void clear() {
        internal.clear();
    }

    @Override
    synchronized public Set<Kk> keySet() {
        return internal.keySet();
    }

    @Override
    synchronized public Collection<Vv> values() {
        return internal.values();
    }

    @Override
    synchronized public Set<Entry<Kk, Vv>> entrySet() {
        return internal.entrySet();
    }
}