package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SearchAtt {

    private static List<Attachment> loop(List<Attachment> list, Function<Attachment, Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            Attachment res = func.apply(att);
            if (res != null) {
                rsl.add(res);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                if (attachment.getSize() > 100) {
                    return attachment;
                }
                return null;
            }
        };

        return loop(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
       Function <Attachment, Attachment> func = new Function<Attachment, Attachment>() {
           @Override
           public Attachment apply(Attachment attachment) {
               if (attachment.getName().contains("bug")) {
                   return attachment;
               }
               return null;
           }
       };
        return loop(list, func);
    }
}
