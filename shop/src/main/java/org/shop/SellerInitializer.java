package org.shop;

import java.util.*;

import org.shop.api.SellerService;
import org.shop.data.Seller;

/**
 * The Seller Initializer util class.
 */
public class SellerInitializer {

    /** The seller service. */
    private SellerService sellerService;

    public SellerInitializer(SellerService sellerService) {
        super();
        this.sellerService = sellerService;
    }

    /**
     * Inits the sellers.
     */
    public void initSellers() {
        List<Seller> sellers = new LinkedList<>();
        Map<Long, String> sellerNames = new HashMap<>();
        sellerNames.put((long)1, "amazon");
        sellerNames.put((long)2, "samsung");
        
        for (Map.Entry<Long, String> entry : sellerNames.entrySet()) {
            Seller seller = new Seller();
            seller.setId(entry.getKey());
            seller.setName(entry.getValue());
            
            sellers.add(seller);
        }
        
        sellerService.importSellers(sellers);
    }
}
