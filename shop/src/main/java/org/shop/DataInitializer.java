package org.shop;

import org.springframework.beans.factory.InitializingBean;

/**
 * The main Data Initializer util class.
 */
public class DataInitializer implements InitializingBean {

    /** The seller initializer. */
    private SellerInitializer sellerInitializer;
    
    /** The product initializer. */
    private ProductInitializer productInitializer;
    
    /** The proposal initializer. */
    private ProposalInitializer proposalInitializer;
    
    /** The user initializer. */
    private UserInitializer userInitializer;

    public DataInitializer(SellerInitializer sellerInitializer, ProductInitializer productInitializer, ProposalInitializer proposalInitializer, UserInitializer userInitializer) {
        this.sellerInitializer = sellerInitializer;
        this.productInitializer = productInitializer;
        this.proposalInitializer = proposalInitializer;
        this.userInitializer = userInitializer;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initData();
    }

    /**
     * Inits the data.
     */
    public void initData() {
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
    }
}
