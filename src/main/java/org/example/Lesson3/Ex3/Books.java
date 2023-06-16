package org.example.Lesson3.Ex3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private String name;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer pagesCount;
}
