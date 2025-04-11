package _02_structural_patterns._09_decorator._03_java;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);

        // books.add(new Item()); // 컴파일 오류: ClassCastException

        List unmodifianleList = Collections.unmodifiableList(list);
        list.add(new Item());
        unmodifianleList.add(new Book());

        // 서블릿 요청 또는 응답 랩퍼
        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    public static class Book {
    }

    public static class Item {
    }
}