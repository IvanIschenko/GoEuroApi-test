package com.gueuro.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CsvSuggestionDto {
    @JsonProperty("_id")
    private long id;
    private String name;
    private String type;
    private double latitude;
    private double longitude;
}
