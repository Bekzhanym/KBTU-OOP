import java.util.Iterator;

/**
 * Самый общий контракт «группа элементов»: размер, проверка наличия, добавление/удаление,
 * обход. Допуск дубликатов и порядок — на усмотрение реализации (не зашиты в интерфейс).
 */
public interface MyCollection<E> extends Iterable<E> {

    int size();

    boolean isEmpty();

    boolean contains(Object element);

    boolean add(E element);

    boolean remove(Object element);

    void clear();

    @Override
    Iterator<E> iterator();
}
