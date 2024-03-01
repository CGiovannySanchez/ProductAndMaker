package com.giovanni.rest.controllers.dto;

import com.giovanni.rest.entities.Product;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MakerDTO {


    private Long id;

    private String name;

    private List<Product> productList = new ArrayList<>();
}
