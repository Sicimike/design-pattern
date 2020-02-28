package com.sicimike.behavioral.chainofresponsibility;

/**
 * 事项处理者
 * @author sicimike
 * @create 2020-02-28 21:31
 */
public abstract class MatterHandler {

    protected MatterHandler next;

    protected void setNext(MatterHandler next) {
        this.next = next;
    }

    protected abstract void approve(ApprovalMatter approvalMatter);
}
