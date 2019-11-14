package demo.mapper.base;

import java.util.List;

public interface BaseMapper<T> {

    public void insert(T t);

    public void delete(int id);

    public void update(T t);

    public T get(int id);

    public List<T> findAll();

    public int getCountById(int id);

    public List<T> getyName(String name);

}
