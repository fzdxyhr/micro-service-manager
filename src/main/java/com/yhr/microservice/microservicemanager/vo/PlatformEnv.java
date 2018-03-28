package com.yhr.microservice.microservicemanager.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by YHR on 2018/3/28.
 */

@Data
public class PlatformEnv {

    @ApiModelProperty("操作系统名称")
    private String osName;
    @ApiModelProperty("jvm名称")
    private String javaVmName;
    @ApiModelProperty("jdk版本")
    private String javaVersion;
    @ApiModelProperty("系统位数")
    private String osBit;

}
