package com.sicimike.behavioral.chainofresponsibility;

/**
 * 部门经理
 * @author sicimike
 * @create 2020-02-28 21:40
 */
public class DepartmentManagerHandler extends MatterHandler {

    private static final int MAX_PERMIT_DURATION = 5;

    @Override
    protected void approve(ApprovalMatter approvalMatter) {
        if (approvalMatter.getDuration() < MAX_PERMIT_DURATION) {
            System.out.println("部门经理同意，审批结束");
        } else {
            if (next != null) {
                System.out.println("部门经理审批权限不够，转交给董事长审批");
                next.approve(approvalMatter);
            } else {
                System.out.println("部门经理不同意，审批结束");
            }
        }
    }
}
