package ru.job4j.tree;

import java.util.*;
import java.util.function.Predicate;

class Tree<E> implements SimpleTree<E> {
    private final Node<E> root;

    Tree(final E root) {
        this.root = new Node<>(root);
    }

    @Override
    public boolean add(E parent, E child) {
        Optional<Node<E>> up = this.findBy(parent);
        if (this.findBy(child).isPresent() || up.isEmpty() || parent.equals(child)) {
            return false;
        }
        Node<E> childNode = new Node<>(child);
        if (up.get().children.contains(childNode)) {
            return false;
        }
        return up.get().children.add(childNode);
    }

    public boolean isBinary() { //бинарен
        return findByPredicate(e -> (long) e.children.size() > 2).isEmpty();
    }

    private Optional<Node<E>> findByPredicate(Predicate<Node<E>> condition) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (condition.test(el)) {
                rsl = Optional.of(el);
                break;
            }
            data.addAll(el.children);
        }
        return rsl;
    }

    @Override
    public Optional<Node<E>> findBy(E value) {
        return findByPredicate(e -> Objects.equals(e.value, value));
    }
}