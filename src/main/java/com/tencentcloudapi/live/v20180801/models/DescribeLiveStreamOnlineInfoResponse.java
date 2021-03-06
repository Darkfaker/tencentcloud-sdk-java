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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveStreamOnlineInfoResponse extends AbstractModel{

    /**
    * 分页的页码。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页大小。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 符合条件的总个数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Integer TotalNum;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Integer TotalPage;

    /**
    * 流信息列表。
    */
    @SerializedName("StreamInfoList")
    @Expose
    private StreamInfo [] StreamInfoList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分页的页码。 
     * @return PageNum 分页的页码。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 分页的页码。
     * @param PageNum 分页的页码。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小。 
     * @return PageSize 每页大小。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小。
     * @param PageSize 每页大小。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 符合条件的总个数。 
     * @return TotalNum 符合条件的总个数。
     */
    public Integer getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 符合条件的总个数。
     * @param TotalNum 符合条件的总个数。
     */
    public void setTotalNum(Integer TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 总页数。 
     * @return TotalPage 总页数。
     */
    public Integer getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Integer TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 流信息列表。 
     * @return StreamInfoList 流信息列表。
     */
    public StreamInfo [] getStreamInfoList() {
        return this.StreamInfoList;
    }

    /**
     * Set 流信息列表。
     * @param StreamInfoList 流信息列表。
     */
    public void setStreamInfoList(StreamInfo [] StreamInfoList) {
        this.StreamInfoList = StreamInfoList;
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
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "StreamInfoList.", this.StreamInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

