package com.sicimike.behavioral.chainofresponsibility;

/**
 * 董事长
 * @author sicimike
 * @create 2020-02-28 21:42
 */
public class ChairmanHandler extends MatterHandler {

    private static final int MAX_PERMIT_DURATION = 10;

    @Override
    protected void approve(ApprovalMatter approvalMatter) {
        if (approvalMatter.getDuration() < MAX_PERMIT_DURATION) {
            System.out.println("董事长同意，审批结束");
        } else {
            if (next != null) {
                next.approve(approvalMatter);
            } else {
                System.out.println("董事长不同意，审批结束");
            }
        }
    }
}
