package com.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wzy on 2019/1/25 11:45
 **/
public class gameConstant {

    private List<String> JingJie= Arrays.asList("炼气","筑基","金丹","元婴","化神");


    /**
     * 护甲减伤计算
     * @param armor
     * @return
     */
    public double armorDamageReduce(double armor){
        return 25*Math.log(0.4*armor+1.0);

    }
}
