package com.koitourdemo.demo.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KoiFarmRequest {
    String name;
    String address;
    String phone;
    String description;
    String imgUrl;
    Date createAt;
}