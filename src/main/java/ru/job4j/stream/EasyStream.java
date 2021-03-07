package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EasyStream {

    private List<Integer> source;
    private Function<Integer, Integer> fun;
    private Predicate<Integer> pred;
    private static EasyStream es;

    public static EasyStream of(List<Integer> source) {
        if (source == null) {
            throw new UnsupportedOperationException();
        }
        es = new EasyStream();
        es.source = source;
        return es;

    }

    public EasyStream map(Function<Integer, Integer> fun) {
        if (es == null) {
            throw new UnsupportedOperationException();
        }
        List<Integer> res = new ArrayList<>();
        for (Integer i : source) {
            int a = fun.apply(i);
            res.add(a);
        }
        es.source = res;
        return es;
    }

    public EasyStream filter(Predicate<Integer> fun) {
        if (es == null) {
            throw new UnsupportedOperationException();
        }
        List<Integer> res = new ArrayList<>();
        for (Integer i : source) {
            if (fun.test(i)) {
                res.add(i);
            }
        }
        es.source = res;
        return es;
     }

    public List<Integer> collect() {
        return es.source;
    }
}
