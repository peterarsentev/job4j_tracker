package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {

        Function<List<Attachment>, List<Attachment>> fun = new UnaryOperator<List<Attachment>>() {
            @Override
            public List<Attachment> apply(List<Attachment> attachments) {
                List<Attachment> rsl = new ArrayList<>();
                for (Attachment att : attachments) {
                    if (att.getSize() > 100) {
                        rsl.add(att);
                    }
                }
                return rsl;
            }
        };
        return filter(list, fun);
    }

    public static List<Attachment> filterName(List<Attachment> list) {

        Function<List<Attachment>, List<Attachment>> fun = new UnaryOperator<List<Attachment>>() {
            @Override
            public List<Attachment> apply(List<Attachment> attachments) {
                List<Attachment> rsl = new ArrayList<>();
                for (Attachment att : attachments) {
                    if (att.getName().contains("bug")) {
                        rsl.add(att);
                    }
                }
                return rsl;
            }
        };
        return filter(list, fun);

    }

    private static List<Attachment> filter(List<Attachment> to,
                                           Function<List<Attachment>, List<Attachment>> fun) {
        return fun.apply(to);
    }
}