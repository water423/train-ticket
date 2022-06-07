package adminroute.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fdse
 */
@Data
@NoArgsConstructor
public class RouteInfo {
    private String loginId;

    //这个就是stationId,转发过去之后直接将这个作为stationId赋值给route
    @ApiModelProperty(name = "startStation",value = "startStation",dataType = "String",example = "shanghai")
    private String startStation;

    @ApiModelProperty(name = "endStation",value = "endStation",dataType = "String",example = "taiyuan")
    private String endStation;

    @ApiModelProperty(name = "stationList",value = "stationList",dataType = "String",example = "shanghai,nanjing,shijiazhuang,taiyuan")
    private String stationList;

    @ApiModelProperty(name = "distanceList",value = "distanceList",dataType = "String",example = "0,350,1000,1300")
    private String distanceList;

    //就是routeId,转发到route服务去根据这个id进行查询修改route
    @ApiModelProperty(name = "id",value = "id",dataType = "String",example = "0b23bd3e-876a-4af3-b920-c50a90c90b04")
    private String id;

}
