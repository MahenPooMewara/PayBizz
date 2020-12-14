package com.drk.pay_bizz.modals;

/**
 * Created by Mahendra Mewara
 */
public class FAQItemModal {

    /**
     * Constructor of FAQItemModal
     * @param faq
     * @param faqa
     */
    public FAQItemModal(String faq, String faqa) {
        this.faq = faq;
        this.faqa = faqa;
    }

    /**
     * getFaq of FAQItemModal
     * @return
     */
    public String getFaq() {
        return faq;
    }

    /**
     * setFaq of FAQItemModal
     * @param faq
     */
    public void setFaq(String faq) {
        this.faq = faq;
    }

    /**
     * getFaqa of FAQItemModal
     * @return
     */
    public String getFaqa() {
        return faqa;
    }

    /**
     * setFaqa of FAQItemModal
     * @param faqa
     */
    public void setFaqa(String faqa) {
        this.faqa = faqa;
    }

    private String faq;
    private String faqa;

}
