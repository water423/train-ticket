package admintravel.entity;

import java.util.Date;

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
public class TravelInfo {
//    @ApiModelProperty(name = "loginId",value = "loginId",dataType = "String",example = "")
    private String loginId;

    @ApiModelProperty(name = "tripId",value = "tripId",dataType = "String",example = "G1234")
    private String tripId;

    @ApiModelProperty(name = "trainTypeId",value = "trainTypeId",dataType = "String",example = "GaoTieOne")
    private String trainTypeId;

    @ApiModelProperty(name = "routeId",value = "routeId",dataType = "String",example = "92708982-77af-4318-be25-57ccb0ff69ad")
    private String routeId;

    @ApiModelProperty(name = "startingStationId",value = "startingStationId",dataType = "String",example = "shanghai")
    private String startingStationId;

    @ApiModelProperty(name = "stationsId",value = "stationsId",dataType = "String",example = "suzhou")
    private String stationsId;

    @ApiModelProperty(name = "terminalStationId",value = "terminalStationId",dataType = "String",example = "taiyuan")
    private String terminalStationId;

    @ApiModelProperty(name = "startingTime",value = "startingTime",dataType = "Date",example = "1367629200000")
    private Date startingTime;

    @ApiModelProperty(name = "endTime",value = "endTime",dataType = "Date",example = "1367653912000")
    private Date endTime;

}
