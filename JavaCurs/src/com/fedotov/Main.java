package com.fedotov;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean cntne = true;
        while (cntne) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("1 - добавить статью" + "\n");
        System.out.print("2 - поиск по ключевому слову"+ "\n");
        System.out.print("3 - завершить программу"+ "\n");
        System.out.print("Введите действие: ");
        int v = Integer.parseInt(reader.readLine());
       switch (v) {
            case 1:
                try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CursJava", "postgres", "postgres")) {
                    Statement statement = connection.createStatement();
                    System.out.print("Введите ключевое слово: ");
                    String keyword = reader.readLine();
                    System.out.print("Введите Описание: "+ "\n");
                    String discription = reader.readLine();
                    int result = statement.executeUpdate("insert into public.tbl_dictionary (keyword, discription) VALUES (" + "'" + keyword + "'" + "," + "'" + discription + "'" + ")");
                    System.out.print("Статья добавлена");
                    System.out.print("\n");
                } catch (SQLException | IOException e) {
                    System.out.println("Connection failure.");
                    e.printStackTrace();
                }
                break;
            case 2:
                try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CursJava", "postgres", "postgres")) {
                    Statement statement = connection.createStatement();
                    System.out.print("Введите ключевое слово: ");
                    String key = reader.readLine();
                    System.out.printf("%-30.30s  %-30.30s%n", "Ключевое слово", "Описание");
                    ResultSet resultSet = statement.executeQuery("SELECT keyword, discription FROM public.tbl_dictionary where tbl_dictionary.keyword =" + "'" + key + "'");
                    while (resultSet.next()) {
                        System.out.printf("%-30.150s  %-30.150s%n", resultSet.getString("keyword"), resultSet.getString("discription"));
                   }
                    System.out.print("\n");
                } catch (SQLException e) {
                    System.out.println("Connection failure.");
                    e.printStackTrace();
                }
                break;
            case 3:
                cntne = false;
                System.out.print("Программа завершена");
                break;
                default:
                    System.out.print("Введено неверное значение");
                    cntne = false;
            }
            System.out.print("\n");
        }
    }
}
