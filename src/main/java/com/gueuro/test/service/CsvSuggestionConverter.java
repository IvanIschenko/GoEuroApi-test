package com.gueuro.test.service;

import com.gueuro.test.domain.Suggestion;
import com.gueuro.test.dto.CsvSuggestionDto;
import com.sun.istack.internal.NotNull;

public class CsvSuggestionConverter {

    public CsvSuggestionDto toCsvSuggestionDto(@NotNull Suggestion input) {
        CsvSuggestionDto csvSuggestionDto = new CsvSuggestionDto();
        csvSuggestionDto.setId(input.getId());
        csvSuggestionDto.setLatitude(input.getGeoPosition().getLatitude());
        csvSuggestionDto.setLongitude(input.getGeoPosition().getLongitude());
        csvSuggestionDto.setName(input.getName());
        csvSuggestionDto.setType(input.getType());

        return csvSuggestionDto;
    }

}
