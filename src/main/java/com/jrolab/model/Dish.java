package com.jrolab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "dishes")
public class Dish {

    @EqualsAndHashCode.Include
    private String id;
    @Field
    private  String name;
    @Field
    private  Double price;
    @Field
    private  Boolean status;
}
