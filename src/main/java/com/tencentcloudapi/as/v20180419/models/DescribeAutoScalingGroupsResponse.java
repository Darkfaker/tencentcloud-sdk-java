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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScalingGroupsResponse extends AbstractModel{

    /**
    * 伸缩组详细信息列表。
    */
    @SerializedName("AutoScalingGroupSet")
    @Expose
    private AutoScalingGroup [] AutoScalingGroupSet;

    /**
    * 符合条件的伸缩组数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 伸缩组详细信息列表。 
     * @return AutoScalingGroupSet 伸缩组详细信息列表。
     */
    public AutoScalingGroup [] getAutoScalingGroupSet() {
        return this.AutoScalingGroupSet;
    }

    /**
     * Set 伸缩组详细信息列表。
     * @param AutoScalingGroupSet 伸缩组详细信息列表。
     */
    public void setAutoScalingGroupSet(AutoScalingGroup [] AutoScalingGroupSet) {
        this.AutoScalingGroupSet = AutoScalingGroupSet;
    }

    /**
     * Get 符合条件的伸缩组数量。 
     * @return TotalCount 符合条件的伸缩组数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的伸缩组数量。
     * @param TotalCount 符合条件的伸缩组数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AutoScalingGroupSet.", this.AutoScalingGroupSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

