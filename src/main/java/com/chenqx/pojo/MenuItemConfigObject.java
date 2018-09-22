package com.chenqx.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MenuItemConfigObject {

    public MenuItemConfigObject(Boolean validatePrivilege, Boolean validateDescribe, String deviceType) {
        this.device_type = deviceType;
        this.validate_privilege = validatePrivilege;
        this.validate_describe = validateDescribe;
    }

    @JSONField(name = "api_name")
    private String api_name;
    @JSONField(name = "display_name")
    private String display_name;
    @JSONField(name = "number")
    private Integer number;
    @JSONField(name = "icon_index")
    private Integer icon_index;
    @JSONField(name = "icon_path_home")
    private String icon_path_home;
    @JSONField(name = "icon_path_menu")
    private String icon_path_menu;
    //适用终端类型，all代表所有，web代表只web端使用,mobile代表只终端使用
    @JSONField(name = "device_type")
    private String device_type;
    //对象类型,predef_obj代表对象、not_obj代表不是对象
    @JSONField(name = "item_type")
    private String item_type;
    //validate_privilege，false代表验证功能权限
    @JSONField(name = "validate_privilege")
    private Boolean validate_privilege;
    //validate_describe，false代表不验证describe
    @JSONField(name = "validate_describe")
    private Boolean validate_describe;
    @JSONField(name = "url")
    private String url;
    @JSONField(name = "mobile_config")
    private MobileConfig mobile_config;

    @Data
    public class MobileConfig {
        @JSONField(name = "mobile_add_action")
        private String mobile_add_action;
        @JSONField(name = "mobile_list_action")
        private String mobile_list_action;
    }

    @Override
    public String toString() {
        return "MenuItemConfigObject{" +
                "api_name='" + api_name + '\'' +
                ", display_name='" + display_name + '\'' +
                ", number=" + number +
                ", icon_index=" + icon_index +
                ", icon_path_home='" + icon_path_home + '\'' +
                ", icon_path_menu='" + icon_path_menu + '\'' +
                ", device_type='" + device_type + '\'' +
                ", item_type='" + item_type + '\'' +
                ", validate_privilege=" + validate_privilege +
                ", validate_describe=" + validate_describe +
                ", url='" + url + '\'' +
                ", mobile_config=" + mobile_config +
                '}';
    }
}
