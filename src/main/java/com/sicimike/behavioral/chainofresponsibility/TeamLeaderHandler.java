package com.sicimike.behavioral.chainofresponsibility;

/**
 * 组长
 * @author sicimike
 * @create 2020-02-28 21:35
 */
public class TeamLeaderHandler extends MatterHandler {

    private static final int MAX_PERMIT_DURATION = 2;

    @Override
    protected void approve(ApprovalMatter approvalMatter) {
        if (approvalMatter.getDuration() < MAX_PERMIT_DURATION) {
            System.out.println("组长同意，审批结束");
        } else {
            if (next != null) {
                System.out.println("组长审批权限不够，转交给部门经理审批");
                next.approve(approvalMatter);
            } else {
                System.out.println("组长不同意，审批结束");
            }
        }
    }
}
