package com.sicimike.behavioral.chainofresponsibility;

/**
 * @author sicimike
 * @create 2020-02-28 21:43
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        ApprovalMatter approvalMatter = new ApprovalMatter();
        approvalMatter.setMatterName("请假");
        approvalMatter.setCreateName("Sicimike");
        approvalMatter.setDuration(8);

        ChairmanHandler chairmanHandler = new ChairmanHandler();

        DepartmentManagerHandler departmentManagerHandler = new DepartmentManagerHandler();
        departmentManagerHandler.setNext(chairmanHandler);

        TeamLeaderHandler teamLeaderHandler = new TeamLeaderHandler();
        teamLeaderHandler.setNext(departmentManagerHandler);

        teamLeaderHandler.approve(approvalMatter);
    }
}
