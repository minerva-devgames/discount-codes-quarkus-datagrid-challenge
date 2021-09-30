package com.redhat.challenge.discount;

import io.quarkus.runtime.StartupEvent;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.commons.configuration.XMLStringConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class DiscountCodesCacheCreation {

    private static final Logger LOGGER = LoggerFactory.getLogger("DiscountsCodeCacheCreation");

    @Inject
    RemoteCacheManager cacheManager;

    /*
        nmartin7:
        About concurrency and how to avoid it, it's only need configure cache with following flags
        in XML or using ConfigurationBuilder (this second option is recommended in infinispan documentation)
            <locking isolation="READ_COMMITTED"/> or <locking isolation="REPEATABLE_READ"/>
            <transaction mode="NON_XA"/> or <transaction mode="NONE"/> or <transaction mode="FULL_XA"/> or <transaction mode="NON_DURABLE_XA"/> or <transaction mode="BATCH"/>
    */

    private static final String CACHE_CONFIG = "<distributed-cache name=\"%s\">"
            + " <encoding media-type=\"application/x-protostream\"/>"
            + "</distributed-cache>";


    void onStart(@Observes StartupEvent ev) {
        LOGGER.info("Create or get cache named discounts with the default configuration");
        // Inject the cache manager and use the administration API to create the cache.
        // You can also use the operator or the WebConsole to create the cache "discounts"
         String cacheConfig = String.format(CACHE_CONFIG, "discounts_cache");
        cacheManager.administration().getOrCreateCache("discounts_cache", new XMLStringConfiguration(cacheConfig));
        // Use XMLStringConfiguration. Grab a look to the simple tutorial about "creating caches on the fly" in the
        // Infinispan Simple Tutorials repository.
    }
}
