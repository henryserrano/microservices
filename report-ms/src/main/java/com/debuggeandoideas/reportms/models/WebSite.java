package com.debuggeandoideas.reportms.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebSite implements Serializable {

    //private Long id;
    private String name;
   // private Category category;
   // private String description;
}
