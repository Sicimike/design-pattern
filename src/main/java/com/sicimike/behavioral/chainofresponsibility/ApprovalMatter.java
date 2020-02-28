package com.sicimike.behavioral.chainofresponsibility;

/**
 * 审批事项
 * @author sicimike
 * @create 2020-02-28 21:28
 */
public class ApprovalMatter {

    // 事项名称
    private String matterName;
    // 发起人
    private String createName;
    // 持续时间
    private Integer duration;

    public String getMatterName() {
        return matterName;
    }

    public void setMatterName(String matterName) {
        this.matterName = matterName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
