package com.reactive.reactivemongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class EmployeeEvent {
    private Employee employee;
    private Date date;
}
