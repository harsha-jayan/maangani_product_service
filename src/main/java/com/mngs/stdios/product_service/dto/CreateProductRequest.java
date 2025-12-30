package com.mngs.stdios.product_service.dto;

public record CreateProductRequest(String title, Integer price, String color, String occasionType) {
}
