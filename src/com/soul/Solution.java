package com.soul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static List<Plant> allPlants = new ArrayList<>(); //все растения
    private static Map<String,Map<String,Ground>> normalGround = new HashMap<>(); //различные таблицы содержания полезных в-в.


    public static void main(String[] args) throws IOException {
        normalGround.put("Standart",new HashMap<>());
        normalGround.get("Standart").put("Vega",new Ground(700,5));
        begin();

    }

    //Начальная страница
    private static void begin(){
        System.out.println("----Grow Help----");
        System.out.println("1: Показать список растений.");
        System.out.println("2: Создать новое растение");
        System.out.println("3: Выбрать растение");
        System.out.println("4: Выход");
        switch (readValue()){
            case "1":allPlants();
        }




      /*  if (allPlants.isEmpty()){
            System.out.println("Цветов нет, предложить создать новый, да , нет?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String ques;
            do {
                ques = br.readLine();
                if (ques.equalsIgnoreCase("да") ){
                    allPlants.add(createPlant());
                }

            }while (!ques.equalsIgnoreCase("нет"));


        }else {
            System.out.println("Описание доступных опций");

        }*/
    }

    // создание/добавление нового растения
    public static  Plant createPlant() throws IOException {
        String type = "";
        int day = -7; //-7 для правильной проверки при ошибке
        System.out.println("Введите имя");
        String name = readValue();
        String male = "";
        boolean b = false; // переключатель для блоков с исключениями
        System.out.println("Выберите пол растения");
        do {
            System.out.println("1: Регулярный    2: Феминизированный   3: Женский   4: Мужской");

            try {
                switch (Integer.parseInt(readValue())){
                    case 1:male = "Регулярный";b = true;break;
                    case 2: male = "Феминизированный";b = true;break;
                    case 3: male = "Женский";b = true;break;
                    case 4: male = "Мужской";b = true;break;
                }

            }catch (IllegalArgumentException e){
                System.out.println("Выберите правильный пол из списка");
            }
        }while (!b);
        b = false;
        do {
            System.out.println("Сколько дней растению?-1 если росток или раньше");

            try {
                day = Integer.parseInt(readValue());
                if (day<0 && day!=-1){
                    continue;
                }
                b = true;

            }catch (IllegalArgumentException e){
                System.out.println("Значение не верно.");

            }
        }while (!b);
        b = false;
        do {
            System.out.println("Выберите тип цветения");
            System.out.println("1: Фотопериодный   2: Автоцветущий");
            try {
                switch (Integer.parseInt(readValue())) {
                    case 1:
                        type = "Фотопериодный";
                        b = true;
                        break;
                    case 2:
                        type = "Автоцветущий";
                        b = true;
                        break;
                }
            }catch (IllegalArgumentException e){
                System.out.println("Значение не верно.");
            }


        }while (!b);
        //TODO добавить создание земли при создании цветка с возможностью выбора

        return new Plant(name,male,type,day);


    }

    //список всех растений
    public static void allPlants(){
        if (allPlants.isEmpty()){
            System.out.println("Список растений пуст.Добавьте растение на главной странице.");
            begin();
            return;
        }
        System.out.println("----Список растений----");
        for (int i = 0;i<allPlants.size();i++){
            System.out.println(i+1+": "+allPlants.get(i));
        }
        System.out.println("1: Выбрать растение  \n2:Вернуться на главную");
         switch (Integer.parseInt(readValue())){
            case 1:
                System.out.println("Введите номер");
                try {
                    choosePlant(Integer.parseInt(readValue()));
                }catch (IllegalArgumentException e){
                    System.out.println();

                }
            case 2:
                begin();
        }

    }

    //вспомогательный метод чтения с клавиатуры
    private static String readValue() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    //метод выбра растения для просмотра и редактирования
    private static void choosePlant(int id){
        if (allPlants.get(id).hasGround()){
            for (int i = 0;i<3;i++){
                //if (groundAndPlant.get(allPlants.get(id)).getPh())

            }
        } else         System.out.println(allPlants.get(id));

        switch (readValue()){ //TODO Дописать метод с окном выбора растения(добавить пункты выбора)
            case "add Ground":
                System.out.println();
        }

    }

    //проверка PH/ppm на норму
    private boolean isNormal(String param,Plant plant,Ground ground){
        //TODO
        switch (param){
            case "PH": if (true);
        }
        return false;

    }





}
