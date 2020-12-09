package com.ssafaya.practice.vng;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {

    public static void main(String[] args) {
        Set<Book> set = new TreeSet<>();
        set.add(new Book(10, "Book-1"));
        set.add(new Book(20, "Book-2"));

        System.out.println(set.size());

//        Collections.sort(set);
    }

    static class Book implements Comparable<Book> {
        private int id;
        private String name;

        public Book() {
        }

        public Book(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Book o) {
            if(this.id == o.id) {
                return 0;
            } else if(this.id < o.id) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
