package auth.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * user login dto
 *
 * @author fdse
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class BasicAuthDto implements Serializable {
    private static final long serialVersionUID = 5505144168320447022L;
    @ApiModelProperty(name = "username",value = "username",dataType = "String",example = "test4fuzzing")
    private String username;

    @ApiModelProperty(name = "password",value = "password",dataType = "String",example = "test4fuzzing")
    private String password;

    @ApiModelProperty(name = "verificationCode",value = "verificationCode",dataType = "String",example = "1234")
    private String verificationCode;
}
