package food.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class Food implements Serializable{

    @ApiModelProperty(name = "foodName",value = "foodName",dataType = "String",example = "Pork Chop with rice")
    private String foodName;

    @ApiModelProperty(name = "price",value = "price",dataType = "double",example = "9.5")
    private double price;
    public Food(){
        //Default Constructor
    }

}
