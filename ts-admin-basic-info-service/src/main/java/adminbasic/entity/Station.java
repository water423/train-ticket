package adminbasic.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author fdse
 */
@Data
@ApiModel
public class Station {
    @ApiModelProperty(name = "id",value = "id",dataType = "String",example = "shanghai")
    private String id;

    @Valid
    @NotNull
    @ApiModelProperty(name = "name",value = "name",dataType = "String",example = "Shang Hai")
    private String name;

    @ApiModelProperty(name = "stayTime",value = "stayTime",dataType = "int",example = "10")
    private int stayTime;

    public Station(){
        this.name = "";
    }



    public Station(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public Station(String id, String name, int stayTime) {
        this.id = id;
        this.name = name;
        this.stayTime = stayTime;
    }

}
