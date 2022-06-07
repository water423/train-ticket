package inside_payment.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author fdse
 */
@Data
@ApiModel
public class AccountInfo {

    @ApiModelProperty(name = "userId",value = "userId",dataType = "String",example = "4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f")
    private String userId;
    @ApiModelProperty(name = "money",value = "money",dataType = "String",example = "9900.0")
    private String money;

    public AccountInfo(){
        //Default Constructor
    }

}
