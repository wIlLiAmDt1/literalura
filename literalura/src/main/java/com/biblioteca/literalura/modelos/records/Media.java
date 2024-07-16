package com.biblioteca.literalura.modelos.records;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Media(
        @JsonAlias("image/jpeg") String imagen
){}
