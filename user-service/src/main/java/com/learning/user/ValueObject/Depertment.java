package com.learning.user.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depertment {
    private Long depertmentId;
    private String depertmentName;
    private String depertmentCode;
}
