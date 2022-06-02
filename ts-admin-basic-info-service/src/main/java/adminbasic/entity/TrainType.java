package adminbasic.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fdse
 */
@Data
@ApiModel
public class TrainType {
    @ApiModelProperty(name = "id",value = "id",dataType = "String",example = "GaoTieOne")
    private String id;
    @ApiModelProperty(name = "economyClass",value = "economyClass",dataType = "int",example = "2147483647")
    private int economyClass;
    @ApiModelProperty(name = "confortClass",value = "confortClass",dataType = "int",example = "2147483647")
    private int confortClass;
    @ApiModelProperty(name = "averageSpeed",value = "averageSpeed",dataType = "int",example = "250")
    private int averageSpeed;

    public TrainType(){
        //Default Constructor
    }

    public TrainType(String id, int economyClass, int confortClass) {
        this.id = id;
        this.economyClass = economyClass;
        this.confortClass = confortClass;
    }

    public TrainType(String id, int economyClass, int confortClass, int averageSpeed) {
        this.id = id;
        this.economyClass = economyClass;
        this.confortClass = confortClass;
        this.averageSpeed = averageSpeed;
    }

}
