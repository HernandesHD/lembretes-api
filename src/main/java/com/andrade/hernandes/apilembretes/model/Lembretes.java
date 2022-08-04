package com.andrade.hernandes.apilembretes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class Lembretes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 250, nullable = false)
    private String description;

    @Column(length = 10, nullable = false)
    private String priority;

}
