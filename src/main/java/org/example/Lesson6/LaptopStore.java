package org.example.Lesson6;

import java.util.*;

public class LaptopStore {
    private Set<Laptop> laptops;

    public LaptopStore() {
        laptops = new HashSet<>();
    }

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void filterLaptops(Map<String, Object> criteria) {
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            boolean matches = true;
            for (String key : criteria.keySet()) {
                Object value = criteria.get(key);
                if (key.equals("ОЗУ")) {
                    if (laptop.getRam() < (int) value) {
                        matches = false;
                        break;
                    }
                } else if (key.equals("Объем ЖД")) {
                    if (laptop.getStorage() < (int) value) {
                        matches = false;
                        break;
                    }
                } else if (key.equals("Операционная система")) {
                    if (!laptop.getOs().equalsIgnoreCase((String) value)) {
                        matches = false;
                        break;
                    }
                } else if (key.equals("Цвет")) {
                    if (!laptop.getColor().equalsIgnoreCase((String) value)) {
                        matches = false;
                        break;
                    }
                }
            }
            if (matches) {
                filteredLaptops.add(laptop);
            }
        }
        System.out.println("Результаты фильтрации: ");
        if (filteredLaptops.isEmpty()){
            System.out.println("Ничего не найдено.");
        }else {
            for(Laptop laptop: filteredLaptops){
                System.out.println(laptop);
            }
        }
    }
}



