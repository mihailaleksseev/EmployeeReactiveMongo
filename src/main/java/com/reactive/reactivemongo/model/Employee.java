package com.reactive.reactivemongo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Annotation for lombok to generate code
 */

@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@Data
@Document
public class Employee {

    @Id
    private String id;
    private String name;
    private Long salary;
}
