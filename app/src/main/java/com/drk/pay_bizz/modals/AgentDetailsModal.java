package com.drk.pay_bizz.modals;

/**
 * Created By Mahendra Mewara
 */
public class AgentDetailsModal {

    /**
     * Constructor of AgentDetailsModal
     * @param agent_profile_pic
     * @param agent_name
     * @param agent_comment
     */
    public AgentDetailsModal(int agent_profile_pic, String agent_name, String agent_comment) {
        this.agent_profile_pic = agent_profile_pic;
        this.agent_name = agent_name;
        this.agent_comment = agent_comment;
    }

    /**
     * getAgent_profile_pic of AgentDetailsModal
     * @return
     */
    public int getAgent_profile_pic() {
        return agent_profile_pic;
    }

    /**
     * setAgent_profile_pic of AgentDetailsModal
     * @param agent_profile_pic
     */
    public void setAgent_profile_pic(int agent_profile_pic) {
        this.agent_profile_pic = agent_profile_pic;
    }

    /**
     * getAgent_name of AgentDetailsModal
     * @return
     */
    public String getAgent_name() {
        return agent_name;
    }

    /**
     * setAgent_name of AgentDetailsModal
     * @param agent_name
     */
    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    /**
     * getAgent_comment of AgentDetailsModal
     * @return
     */
    public String getAgent_comment() {
        return agent_comment;
    }

    /**
     * setAgent_comment of AgentDetailsModal
     * @param agent_comment
     */
    public void setAgent_comment(String agent_comment) {
        this.agent_comment = agent_comment;
    }

    private int agent_profile_pic;

    private String agent_name;

    private String agent_comment;



}
