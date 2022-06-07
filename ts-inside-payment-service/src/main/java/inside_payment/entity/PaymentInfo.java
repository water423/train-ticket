package inside_payment.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@ApiModel
public class PaymentInfo {
    public PaymentInfo(){
        //Default Constructor
    }

    @ApiModelProperty(name = "userId",value = "userId",dataType = "String",example = "4d2a46c7-71cb-4cf1-b5bb-b68406d9da6f")
    private String userId;

    @ApiModelProperty(name = "orderId",value = "orderId",dataType = "String",example = "5ad7750b-a68b-49c0-a8c0-32776b067702")
    private String orderId;

    private String tripId;

    @ApiModelProperty(name = "price",value = "price",dataType = "String",example = "100.0")
    private String price;

}
