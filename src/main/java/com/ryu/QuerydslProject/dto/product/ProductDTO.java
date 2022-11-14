package com.ryu.QuerydslProject.dto.product;

public class ProductDTO {

    public static class SaveRequest {
        private String name;

        private int price;

        private String information;

    }


    public static class UpdateRequest {
        private String name;

        private int price;

        private String information;

    }
}
