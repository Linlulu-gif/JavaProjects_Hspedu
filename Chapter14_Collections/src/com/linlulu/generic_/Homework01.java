package com.linlulu.generic_;

import java.util.*;

import com.linlulu.generic_.User;
import org.junit.Test;

/**
 * @author 林露露
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void TestJunit(){
        DAO<User> userDAO = new DAO<>();

        userDAO.save("1",new User(1,19,"张三"));
        userDAO.save("2",new User(2,29,"刘元"));
        userDAO.save("3",new User(3,19,"孟夏"));
        userDAO.save("4",new User(4,17,"张六"));
//        List<User> users = userDAO.list();
//        System.out.println(users);
        System.out.println(userDAO.toString());
    }
}

class DAO<T>{
    private Map<String,T> map = new HashMap<>();

    public void save(String id, T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }
    
    public List<T> list(){
        ArrayList<T> list = new ArrayList<>();
        Set<String> set = map.keySet();
        for(String id : set) {
            list.add(map.get(id));
        }
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }

    @Override
    public String toString() {
        return "DAO{" +
                "map=" + map +
                '}';
    }
}
