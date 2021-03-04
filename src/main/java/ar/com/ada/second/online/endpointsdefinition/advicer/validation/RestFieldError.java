package ar.com.ada.second.online.endpointsdefinition.advicer.validation;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class RestFieldError {

    private String field;
    private String message;


}
