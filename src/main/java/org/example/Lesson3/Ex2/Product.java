package org.example.Lesson3.Ex2;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Product {
//private  String name;
//private  String country;
//private Integer weight;
//private Integer price;
//private Integer sort;
//
//}
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product2 {
    private String name;
    private String country;
    private double weight;
    private Integer price;
    private Integer sort;

}