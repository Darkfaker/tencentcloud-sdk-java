/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewInstanceRequest extends AbstractModel{

    /**
    * 时间长度
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * 资源ID列表
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 位置信息
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 计费模式，0表示按量，1表示包年报月，此处只能为包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private Integer PayMode;

    /**
    * 时间单位，默认为m
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 货币种类
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get 时间长度 
     * @return TimeSpan 时间长度
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时间长度
     * @param TimeSpan 时间长度
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 资源ID列表 
     * @return ResourceIds 资源ID列表
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源ID列表
     * @param ResourceIds 资源ID列表
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 位置信息 
     * @return Placement 位置信息
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 位置信息
     * @param Placement 位置信息
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 计费模式，0表示按量，1表示包年报月，此处只能为包年包月 
     * @return PayMode 计费模式，0表示按量，1表示包年报月，此处只能为包年包月
     */
    public Integer getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式，0表示按量，1表示包年报月，此处只能为包年包月
     * @param PayMode 计费模式，0表示按量，1表示包年报月，此处只能为包年包月
     */
    public void setPayMode(Integer PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 时间单位，默认为m 
     * @return TimeUnit 时间单位，默认为m
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单位，默认为m
     * @param TimeUnit 时间单位，默认为m
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 货币种类 
     * @return Currency 货币种类
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 货币种类
     * @param Currency 货币种类
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

