package adminbasic.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fdse
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class Config {
    @ApiModelProperty(name = "name",value = "name",example = "DirectTicketAllocationProportion")
    private String name;

    @ApiModelProperty(name = "value",value = "value",example = "0.5")
    private String value;
    @ApiModelProperty(name = "description",value = "description",example = "Allocation Proportion Of The Direct Ticket - From Start To End")
    private String description;

}
