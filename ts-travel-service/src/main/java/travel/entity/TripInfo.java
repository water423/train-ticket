package travel.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@ApiModel
public class TripInfo {

    @Valid
    @NotNull
    @ApiModelProperty(name = "startingPlace",value = "startingPlace",dataType = "String",example = "Shang Hai Hong Qiao")
    private String startingPlace;

    @Valid
    @NotNull
    @ApiModelProperty(name = "endPlace",value = "endPlace",dataType = "String",example = "Tai Yuan")
    private String endPlace;

    @Valid
    @NotNull
    private Date departureTime;

    public TripInfo(){
        //Default Constructor
        this.startingPlace = "";
        this.endPlace = "";
        this.departureTime = new Date();
    }

}
