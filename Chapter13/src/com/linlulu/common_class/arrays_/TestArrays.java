package com.linlulu.common_class.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 林露露
 * @version 1.0
 *  演示使用 类 Arrays中的相关方法
 */
@SuppressWarnings("all")
public class TestArrays {
    public static void main(String[] args) {
        //1. Arrays.toString(arr)---------------> [,,,,,]
        Double[] arr = {23.5, 12.0, -5.1, 27.2, 19.2, 9.6};
        System.out.println("排序前 arr = " + Arrays.toString(arr));
//        Arrays.sort(arr);//默认从小到大排序，底层是 binarySort
        //通过匿名内部类，动态绑定反向排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int  compare(Object o1, Object o2) {
                return (int) ((Double) o2 - (Double) o1);//好哦麻烦，，，，不能直接int,double类型的数组
            }
        });

        System.out.println("反向排序后 arr = " + Arrays.toString(arr));

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100.0);
        books[1] = new Book("金瓶梅",70.0);
        books[2] = new Book("Java入门到放弃",49.9);
        books[3] = new Book("青年文摘",5.5);
        System.out.println("========排序前==========");
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println("========按照价格从大到小排序后==========");
//        Book.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//                return (int) (book2.getPrice() - book1.getPrice());
//            }
//        });
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o2.getPrice() - o1.getPrice());//这里的强转会有精度损失，底层只是判断两个值是否是正负
                //可以先接收一下，然后判断正负，返回一个正负值 或 0
            }
        });
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("========按照书名长度从大到小排序后==========");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().length() - o1.getName().length();
            }
        });
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

@SuppressWarnings("all")
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void sort(Book[] books, Comparator comparator){
        Book temp;
        int count = 0;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if(comparator.compare(books[j].price,books[j + 1].price) > 0){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                    count ++;
                }
            }
            if (count == 0){
                break;
            }
            count = 0;//置零
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String formatStr = "name = " + name + "\t\t\tprice = " + price;
        return formatStr;
    }
}
